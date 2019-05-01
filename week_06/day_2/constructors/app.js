const Pet = require('./pet.js')
const Person = require('./person.js')


const scooby = new Pet("Scooby", "Dog");
// scooby.eat("Scooby Snack");


const shaggy = new Person("Shaggy", scooby);
shaggy.greet();
shaggy.feedPet('scooby snacks')
