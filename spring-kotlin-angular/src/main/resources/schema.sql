-- DROP TABLE PERSON
-- DROP SEQUENCE ID
CREATE SEQUENCE ID START WITH 100
CREATE TABLE PERSON("ID" INTEGER not null primary key, "NAME" VARCHAR(50), "DESCRIPTION" VARCHAR(100), "IMAGEURL" VARCHAR(500))
