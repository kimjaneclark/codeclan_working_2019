const Pet = function(name, species){
  this.name = name
  this.species = species
}

Pet.prototype.eat = function(food){
  console.log(`${this.name} ate a ${food}`);
}

const scobby = new Pet ("Scobby", "Dog")

// // console.log(scobby);
// scobby.eat("Scooby snack")


module.exports = Pet
