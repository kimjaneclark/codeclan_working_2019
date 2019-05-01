require_relative ('../db/sql_runner.rb')


class PizzaOrder

  attr_accessor :topping, :quantity, :customer_id
  attr_reader :id

  def initialize(options)
    @topping = options['topping']
    @quantity = options['quantity'].to_i
    @customer_id = options['customer_id'].to_i
    @id = options['id'].to_i if options['id']
  end

  def save()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "INSERT INTO pizza_orders
    (
      topping,
      quantity,
      customer_id
    ) VALUES
    (
      $1, $2, $3
    )
    RETURNING id"
    values = [@topping, @quantity, @customer_id]
    # db.prepare("save", sql)
    result = SqlRunner.run(sql, values)
    @id = result[0] ["id"].to_i
    # @id = db.exec_prepared("save", values)[0]["id"].to_i
    # db.close()
  end

  def update()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "
    UPDATE pizza_orders SET (
      topping,
      quantity,
      customer_id
    ) =
    (
      $1, $2, $3
    )
    WHERE id = $4"
    values = [@topping, @quantity, @customer_id, @id]
    SqlRunner.run(sql, values)
    # db.prepare("update", sql)
    # db.exec_prepared("update", values)
    # db.close()
  end

  def delete()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "DELETE FROM pizza_orders where id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
    # db.prepare("delete", sql)
    # db.exec_prepared("delete", values)
    # db.close()
  end

  def self.find(id)
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "SELECT * FROM pizza_orders WHERE id = $1"
    values = [id]
    # db.prepare("find", sql)
    results = SqlRunner.run(sql, values)
    # db.close()
    order_hash = results.first
    order = PizzaOrder.new(order_hash)
    return order
  end

  def self.delete_all()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "DELETE FROM pizza_orders"
    SqlRunner.run(sql)
    # db.prepare("delete_all", sql)
    # db.exec_prepared("delete_all")
    # db.close()
  end

  def self.all()
    # db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
    sql = "SELECT * FROM pizza_orders"
    # db.prepare("all", sql)
    # orders = db.exec_prepared("all")
    orders = SqlRunner.run(sql)
    # db.close()
    return orders.map { |order| PizzaOrder.new(order) }
  end

  def customer
    sql = "SELECT * FROM customers WHERE id = $1"
    values = [@customer_id]
    results = SqlRunner.run(sql, values)
    customer_data = results[0]
    customer = Customer.new(customer_data)
  end

end
