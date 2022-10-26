CREATE DATABASE IF NOT EXISTS db_for_everyday
    COLLATE utf8mb4_unicode_ci;

USE db_for_everyday;

CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    author VARCHAR(50),
    reading_status VARCHAR(15),
    resume VARCHAR(255)
);

