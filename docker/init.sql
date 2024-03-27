CREATE SCHEMA IF NOT EXISTS contact_schema;

CREATE TABLE IF NOT EXISTS contact_schema.contact
(
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(127) NOT NULL,
    last_name VARCHAR(127) NOT NULL,
    email VARCHAR(127) NOT NULL,
    phone BIGINT NOT NULL
)