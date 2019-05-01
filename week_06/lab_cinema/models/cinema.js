const Cinema = function() {
  this.films = []
}

Cinema.prototype.addFilm = function (film) {
  this.films.push(film);
};

Cinema.prototype.filmTitles = function () {
  titleList = []
  this.films.forEach((film) => {
    const title = film.title
    titleList.push(title)

  // return this.films.map(film => return film.title)
});
  return titleList
};


Cinema.prototype.findByTitle = function (title) {
  const result = this.films.find((film) => {
    return film.title === title;
  });
  return result;
};

Cinema.prototype.findByGenre = function (genre) {
  const result = this.films.filter((film) => {
    return film.genre === genre;
  });
  return result;
};

Cinema.prototype.filmByYear = function (year) {
  const result = this.films.some((film) => {
    return film.year === year;
  });
return result
};

Cinema.prototype.filmLengths = function (length) {
  const result = this.films.every((film) => {
    return film.length > length;
  });
return result
};

Cinema.prototype.totalLength = function () {
  const result = this.films.reduce((totalLength, film) => {
    return totalLength + film.length;
  }, 0);
return result
};

Cinema.prototype.findByYear = function (year) {
  const result = this.films.filter((film) => {
    return film.year === year;
  });
  return result;
};



module.exports = Cinema;
