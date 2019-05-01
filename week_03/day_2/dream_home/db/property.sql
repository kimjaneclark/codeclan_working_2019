DROP TABLE IF EXISTS properties;

CREATE TABLE properties (
  id SERIAL4 PRIMARY KEY,
  address VARCHAR(255),
  value INT4,
  no_bedrooms INT2,
  build VARCHAR(255)
)
