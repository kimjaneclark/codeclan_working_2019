const Taxi = function(manufacturer, model, driver){
  this.manufacturer = manufacturer
  this.model = model
  this.driver = driver
  this.passengers = []
}

 Taxi.prototype.countPassengers = function(){
   return this.passengers.length;
 };

 Taxi.prototype.addPassengers = function(passenger){
   return this.passengers.push(passenger)
 }

 Taxi.prototype.removePassengerName = function(passenger){
   const position = this.passengers.indexOf(passenger);
   this.passengers.splice(position, 1);
 }

 Taxi.prototype.removeAllPassengers = function(){
   this.passengers.splice(0, this.countPassengers())
 }


module.exports = Taxi
