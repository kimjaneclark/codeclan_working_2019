


  require("minitest/autorun")
  require("minitest/rg")
  require_relative("../Person")
  require_relative("../Bus")
  require_relative("../BusStop")

  class TestBus < MiniTest::Test

   def setup
     @bus1 = Bus.new("Woodlands", 4)
     @bus2 = Bus.new("Clarkston", 6)

     @person1 = Person.new("Collin", 30)
     @person2 = Person.new("Kim", 41)

   end

   def test_bus_destination
     assert_equal("Woodlands", @bus1.destination)
   end

   def test_bus_route
     assert_equal(4, @bus1.route)
   end

   def test_drive
     assert_equal("brum, brum", @bus1.drive)
   end

   def test_number_of_passengers
     assert_equal(0, @bus1.passenger_count)
   end

   def test_add_passenger_to_bus
     @bus1.pick_up(@person1)
     assert_equal("Collin", @person1.name)
   end

   def test_remove_passenger
     @bus1.pick_up(@person1)
     @bus1.pick_up(@person2)

     @bus1.drop_off("Collin")

     assert_equal(1, @bus1.passenger_count)
   end

   def test_remove_all_passangers
     @bus1.pick_up(@person1)
     @bus1.pick_up(@person2)
     @bus1.empty()
     assert_equal(0, @bus1.passenger_count)
   end

end
