var sports = ["football","tennis","rugby","golf"];

var numberOfElements = sports.length;

// console.log(numberOfElements);

var firstSport = sports[0];
// console.log("first sport is ", firstSport);

sports.push("hockey");
sports.push("cycling");
// console.log("sports: ", sports);

var removedSport = sports.pop();
// console.log(sports);
// console.log(removedSport);

sports.unshift("Basketball")
// console.log(sports);


var removedSport = sports.shift()
// console.log(sports);
// console.log(removedSport);

var removedSport = sports.splice(3, 1)
// console.log(sports);
// console.log("Removed Sport",  removedSport);


// for (var currentSport of sports) {
//   var uppercasedSport = currentSport.toUpperCase();
//   console.log(uppercasedSport);
// }


var movie = {
  title: "It's a wonderful life",
  year: 1946,
  language:"Spanish"

}
// console.log("Movie:", movie);

var title = movie.title;
// console.log(title);

movie.cast = ["Jimmy Stewart", "Donna Reed"];
// console.log(movie);

movie.language = "English";
// console.log(movie);

movie['language'] = "French";
// console.log(movie);
var propertyToAccess = 'subtitle-language';
movie[propertyToAccess] ="German";
// console.log(movie);
// console.log(movie[propertyToAccess]);


delete movie.year;
// console.log(movie);


movie.ratings = {
  critic: 94,
  audience: 95
};
// console.log(movie);

var audienceRating = movie.ratings.audience;
// console.log(audienceRating);

for(var key in movie){
  var value = movie[key];
  console.log(`The ${key} is ${value}`);
}

var keys = Object.keys(movie)
console.log(keys);
