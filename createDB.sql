DROP DATABASE IF EXISTS blog;
CREATE DATABASE blog;
USE blog;
CREATE TABLE IF NOT EXISTS posts (
                                     id INT PRIMARY KEY AUTO_INCREMENT,
                                     title VARCHAR(255),
                                     content TEXT
);

INSERT INTO posts (title, content)
VALUES
    ('Title 1', 'Content 1'),
    ('Title 2', 'Content 2'),
    ('Title 3', 'Content 3'),
    ('Title 4', 'Content 4'),
    ('Title 5', 'Content 5'),
    ('Title 6', 'Content 6'),
    ('Title 7', 'Content 7'),
    ('Title 8', 'Content 8'),
    ('Title 9', 'Content 9'),
    ( 'Title 10', 'Content 10');

-- ##########################