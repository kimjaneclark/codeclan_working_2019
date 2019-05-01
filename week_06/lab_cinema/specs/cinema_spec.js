const assert = require('assert')
const Cinema = require('../models/cinema.js')
const Film = require('../models/film.js')

describe('Cinema', function() {

   let cinema;
   let film1;
   let film2;
   let film3;


   beforeEach(function() {
     cinema = new Cinema ()
     film1 = new Film ("Incredibles", "Kids", 2004, 90)
     film2 = new Film ("Monster Inc", "Kids", 2001, 100)
     film3 = new Film ("Invictus", "Drama", 2009, 105)
   })

   it('Should have a collection of films', function() {
     const actual = cinema.films;
     assert.deepStrictEqual(actual, [])
   })

   it('Should be able to add films', function(){
     cinema.addFilm(film1);
     const actual = cinema.films;
     assert.deepStrictEqual(actual, [film1])
   })


   it('Should be able to get a list of film titles', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const expected = ["Incredibles", "Monster Inc", "Invictus"]
     const actual = cinema.filmTitles();
     assert.deepStrictEqual(actual, expected)
   })

   it('Should be able to find a film by title', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.findByTitle("Monster Inc")
     assert.deepStrictEqual(actual, film2)
   })

   it('Should be able to find a film by genre', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.findByGenre("Kids")
     assert.deepStrictEqual(actual, [film1, film2])
   })

   it('Should be able to check whether there are some films from a particular year', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.filmByYear(2001)
     assert.strictEqual(actual, true)
   })

   it('Should be able to check whether all films are over a particular length', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.filmLengths(60)
     assert.strictEqual(actual, true)
   })

   it('Should be able to calculate total running time of all films', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.totalLength()
     assert.strictEqual(actual, 295)
   })

   it('Should be able to find a film by year', function() {
     cinema.addFilm(film1);
     cinema.addFilm(film2);
     cinema.addFilm(film3);
     const actual = cinema.findByYear(2004)
     assert.deepStrictEqual(actual, [film1])
   })









})
