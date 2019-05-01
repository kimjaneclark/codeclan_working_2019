require('pry')
require_relative('models/pizza_order')

PizzaOrder.delete_all()

order1 = PizzaOrder.new({'first_name'=>'Kim', 'last_name' => "Clark", 'quantity' => '1', 'topping' => 'Ham'})
order1.save()
order2 = PizzaOrder.new({'first_name'=>'Lorna', 'last_name' => "Semple", 'quantity' => '1', 'topping' => 'Texas BBQ'})
order2.save()

order1.first_name = "Kimberley"
order1.update()

binding.pry
nil
