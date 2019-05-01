const myNumbers = [1,2,3,4,5];

// for(let number of myNumbers){
//   console.log(`This is number ${number}`);
// }

// myNumbers.forEach((number) => {
//   console.log(`This is number ${number}`);
// })

// myNumbers.forEach((number, index) => {
//   console.log(`This is number ${number} at index position ${index}`);
// })


// const multiplyByTwo = function (numbers) {
//   const result = [];
//   numbers.forEach((number) => {
//     const multiplied = number * 2
//   result.push(multiplied);
// })
//   return result;
// }
//
// console.log(multiplyByTwo(myNumbers));
//
//
// const map1 = myNumbers.map(number => number * 2);
// console.log(map1);

// const getsEven = function (numbers) {
//   const result = [];
//   numbers.forEach((number) => {
//     if (number % 2 ===0)
//     result.push(number);
//   })
//   return result;
// }
//
// console.log(getsEven(myNumbers));
//
//
// const result = myNumbers.filter(number => number % 2 ===0);
// console.log(result);

// //
//
// const getsTotal = function (numbers){
//   let total = 0;
//   numbers.forEach((number) => {
//     total += number;
//   })
//   return total;
// }
//
// console.log(getsTotal(myNumbers));

const getsTotal = function (numbers){
 const total = numbers.reduce((runningTotal, number) => {return runningTotal + number;
 }, 0);
  return total;
}

console.log(getsTotal(myNumbers));
