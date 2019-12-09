CREATE TABLE IF NOT EXISTS tbl_user (
  id SERIAL PRIMARY KEY ,
  username varchar(25) NOT NULL,
  password varchar(75) NOT NULL,
  salary int NOT NULL,
  age int NOT NULL
) ;