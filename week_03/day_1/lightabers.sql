DROP TABLE lightsabers;
DROP TABLE characters;


CREATE TABLE characters (
  id SERIAL8 PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

CREATE TABLE lightsabers (
  id SERIAL8 PRIMARY KEY,
  hilt_metal VARCHAR(255) NOT NULL,
  colour VARCHAR(255) NOT NULL,
  character_id INT8 REFERENCES characters(id)
);


INSERT INTO characters (name, darkside, age) VALUES('Obi-Wan Kenobi', false, 27);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES('steel', 'green', 1);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES('palladium', 'red', 1);
INSERT INTO lightsabers (hilt_metal, colour, character_id) VALUES('iron', 'blue', 20 );

SELECT * FROM characters;
SELECT * FROM lightsabers WHERE character_id = 1;
