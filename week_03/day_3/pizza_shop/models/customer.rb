require_relative ('../db/sql_runner.rb')



class Customer

  attr_accessor :name
  attr_reader :id

def initialize(options)
  @id = options['id'].to_i if options['id']
  @name = options['name']
end

def save()
  # db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
  sql = "INSERT INTO customers
  (name) VALUES ($1) RETURNING id"
  values = [@name]
  # db.prepare("save", sql)
  # result = db.exec_prepared("save", values)
  result = SqlRunner.run(sql, values)
  @id = result[0] ["id"].to_i
  # db.close()
end

def self.delete_all()
  # db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
  sql = "DELETE FROM customers"
  customers = SqlRunner.run(sql)
  # db.prepare("delete_all", sql)
  # db.exec_prepared("delete_all")
  # db.close()
end

def self.all()
  sql = "SELECT * FROM customers"
  customers = SqlRunner.run(sql)
  return customers.map { |customer| Customer.new(customer)}
end

def pizza_orders
  sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"
  values = [@id]
  results = SqlRunner.run(sql, values)
  orders = results.map {|order| PizzaOrder.new(order)}
  return orders
end




end
