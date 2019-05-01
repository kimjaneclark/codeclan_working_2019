// function sayhello(name){
//   return `Hello ${name}`;
// }
//
//
//
//
// console.log('say hello with no arguments', sayhello());
// console.log('say hello with arguments', sayhello("Kim"));
//
//
// var add = function (first_num, second_num) {
//   return first_num + second_num;
// }
// console.log(add (2,5));
//
//
// Declare a named function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.

// function arraytotal(numbers){
//   var total = 0
//   for (var number of numbers){
//     total += number
//   }
//   return total;
// }
// console.log(arraytotal([1,2,3,4,5]))

// Define an anonymous function expression that takes two arguments:
//
// an object, for example, { name: 'Wojtek', age: 30 }
// a string, for exmaple, 'name'
// Your function should return true if the given string is a key on the given object and false if the object does not have a key that matches the string. Store this function in an appropriately named variable to invoke it.

// var person = {
//   name: "Kim"
//   age: 41
// };
//
//
// var keyExpression = function (object, string){
//   for (var key in object){
//     if (string === key)
//     {return "true";}
//     else
//     {return "false";}
//   }
// }
//
// console.log(keyExpression(person, "name"));




var multiply = (firstNumber, secondNumber) => firstNumber * secondNumber;

console.log(multiply(3,2));
