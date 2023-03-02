CREATE TABLE catalog (
                           id BIGSERIAL PRIMARY KEY NOT NULL,
                           name VARCHAR(30) NOT NULL,
                           category VARCHAR(30) NOT NULL,
                           color VARCHAR(30) NOT NULL,
                           price INT NOT NULL UNIQUE

);