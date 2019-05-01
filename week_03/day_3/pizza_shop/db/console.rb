require("pry")
require_relative("../models/pizza_order")
require_relative("../models/customer")

PizzaOrder.delete_all()
Customer.delete_all()

customer1 = Customer.new({'name' => 'Kim'})
customer1.save()
customer2 = Customer.new({'name' => 'Jim'})
customer2.save()
customer3 = Customer.new({'name' => 'Kyle'})
customer3.save()

order1 = PizzaOrder.new({
  'topping' => 'cheese',
  'quantity' => '2',
  'customer_id' => customer1.id
  })
order1.save()

order2 = PizzaOrder.new({
  'topping' => 'ham',
  'quantity' => '1',
  'customer_id' => customer2.id
  })
order2.save()

order3 = PizzaOrder.new({
  'topping' => 'veg',
  'quantity' => '3',
  'customer_id' => customer3.id
  })
order3.save()

order4 = PizzaOrder.new({
  'topping' => 'texan BBQ',
  'quantity' => '1',
  'customer_id' => customer1.id
  })
order4.save()

order3.delete()


order1.quantity = '10'
order1.update()



binding.pry
nil
