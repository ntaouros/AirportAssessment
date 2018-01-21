# Country schema

# --- !Ups

CREATE TABLE Country (
    id BigInt(2500) NOT NULL AUTO_INCREMENT,
    code varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
    continent varchar(255) NOT NULL,
    wikipedia_link boolean NOT NULL,
    keywords boolean NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE Country;