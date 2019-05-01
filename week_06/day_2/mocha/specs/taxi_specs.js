const assert = require ('assert')
const Taxi = require ('../taxi.js')

describe ('Taxi', function(){

  let taxi;
  beforeEach(function(){
    taxi = new Taxi("Toyota","Prius","Kim");
  })

it('should have a manufacturer',function (){
  const actual = taxi.manufacturer; //act - call the function
  assert.strictEqual(actual, "Toyota");//assert

})

it('should have a model', function(){
  const actual = taxi.model;
  assert.strictEqual(actual, "Prius");
})

it('should have a driver', function(){
  const actual = taxi.driver;
  assert.strictEqual(actual, "Kim");
})

describe('Passengers', function(){

it('should start with no passengers', function(){
  const actual = taxi.passengers
  assert.deepStrictEqual (actual, [])
})

it('should be able to return the number of passengers', function(){
  const actual = taxi.countPassengers()
  assert.strictEqual(actual, 0)
})

it('should be able to add passengers', function(){
  taxi.addPassengers("Abi")
  const actual = taxi.countPassengers()
  assert.strictEqual(actual, 1)
})

it('should be able to remove passengers by name', function(){
  taxi.addPassengers("Fraser")
  taxi.addPassengers("Finlay")
  taxi.removePassengerName("Fraser")
  const expected = ["Finlay"]
  const actual = taxi.passengers
  assert.deepStrictEqual (actual, expected)
})

it('should be able to remove all passengers', function(){
  taxi.addPassengers("Fraser")
  taxi.addPassengers("Finlay")
  taxi.addPassengers("Abi")
  taxi.removeAllPassengers()
  const actual = taxi.countPassengers()
  assert.strictEqual (actual, 0)
})

})


});
