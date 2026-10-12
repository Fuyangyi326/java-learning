CREATE DATABASE IF NOT EXISTS students_db;
USE students_db;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT,
    score INT
);

INSERT INTO student (id, name, age, score) VALUES ('001', '张三', 18, 85);
INSERT INTO student (id, name, age, score) VALUES ('002', '李四', 20, 92);
