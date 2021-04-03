DROP TABLE IF EXISTS Person;

CREATE TABLE Person (
   person_id INTEGER PRIMARY KEY AUTO_INCREMENT ,
   name Varchar(250) NOT NULL,
   age Number(3) NOT NULL,
   nationality Varchar(250)
);

--INSERT INTO Person (name, age, nationality) VALUES
--('Aldo', '25', 'Indonesian'),
--('Aline', '99', 'American');