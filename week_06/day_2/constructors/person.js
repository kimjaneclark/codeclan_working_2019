const Person = function(name, pet){
  this.name = name
  this.pet = pet
}

Person.prototype.greet = function(){
  console.log(`Hi my name is ${this.name}`);
}

Person.prototype.feedPet = function(food){
  console.log(`${this.name} fed ${this.pet.name} ${food}`);
  this.pet.eat(food);
}

const shaggy = new Person("Shaggy", "Scooby");
// shaggy.greet()
// console.log(shaggy);
// can uses dot notation
// console.log(shaggy.name);

const velma = new Person("Velma");
// velma.greet()

// console.log('shaggy', shaggy);
// console.log('velma', velma);

// shaggy.greet()
// velma.greet()

// console.log("shaggys prototype", Object.getPrototypeOf(shaggy));


module.exports = Person
