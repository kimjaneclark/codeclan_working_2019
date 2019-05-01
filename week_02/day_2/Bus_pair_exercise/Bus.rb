require('pry')
class Bus

attr_reader :destination, :route

 def initialize(destination, route)
   @destination = destination
   @route = route
   @passengers = []
 end

 def drive
   return "brum, brum"
 end

 def passenger_count
   return @passengers.count()
 end

 def pick_up(new_passenger)
   @passengers << new_passenger
   return @passengers
 end

 def drop_off(name)
   # binding.pry
   for passenger in @passengers
     if passenger.name == name
       @passengers.delete(passenger)
       return @passengers.count
     end
   end

 end

 def empty()
   @passengers.clear()
   return @passengers.count
 end

end
