DROP TABLE characters;

CREATE TABLE characters (
  id SERIAL8,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);


INSERT INTO characters (name, darkside, age) VALUES('Obi-Wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES('Darth Maul', true, 32);
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);

-- UPDATE characters SET darkside = true
-- WHERE name = 'Anakin Skywalker';

UPDATE characters
SET (name, darkside) = ('Darth Vadar', true)
WHERE name = 'Anakin Skywalker';

UPDATE characters
SET age = 65
WHERE name = 'Obi-Wan Kenobi';



-- DELETE FROM characters WHERE name = 'Darth Maul';

DELETE FROM characters WHERE name = 'Darth Maul' OR darkside = true;

INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);

SELECT * FROM characters ORDER BY id;





-- SELECT count(*) FROM characters;
