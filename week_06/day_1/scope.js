// var name = "Kim";
//
// var secretsFunction = function(){
//   var pinCode = [0,0,0,0];
//   // console.log("pincode inside the secrets function", pinCode);
//   console.log('name inside secret', name);
// }
//
// secretsFunction()
// // console.log("pincode outside the secrets function", pinCode);
// console.log("name outside secret", name);


// var filterNamesByFirstLetter = function(names, letter){
//   var filteredNames = [];
//   for(let name of names){
//     if(name[0] === letter){
//       filteredNames.push(name);
//     }
//   }
//   console.log("name after loop:", name);
//   return filteredNames
// }
//
// var students = ["Alice", "Bob", "Alyssia", "Artem", "Babs"];
// var filteredStudents = filterNamesByFirstLetter(students, "A");
// console.log(filteredStudents);


// let isItFive = function(number){
//   let result;
//   if(number === 5){
//     var result = true;
//   } else {
//     result = false;
//   }
//   return result;
// }

//
// let temperature = 30;
//
// if (temperature > 15) {
//   let jacket = false;
//   var happy = true;
// } else {
//   let jacket = true;
//   var happy = false;
// }
//
// onsole.log('jacket after if-else blocks:', jacket);
// console.log('happy after if-else blocks:', happy);

// const calculateEnergy = function(mass){
//   const speedOfLight = 299792458;
//   return mass * speedOfLight ** 2;
// }
//
// let energyOfMe = calculateEnergy(100);
// console.log(energyOfMe);

// const song = {
//   title: "Raspberry Beret",
//   artist: "Prince"
// }
//
// song = {}
//
//  console.log('song before mutation', song);
//
//  song.title = "When doves cry";
//
//   console.log('song after mutation', song);
//


const helloWorld = function(){
  result = "Hello world!"
}

helloWorld();

console.log(result);
