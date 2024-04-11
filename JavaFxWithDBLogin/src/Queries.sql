use zeal_demo_db;

select * from users;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    login_name VARCHAR(255),
    password VARCHAR(255),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status VARCHAR(50)
);


INSERT INTO users (name, login_name, password, status)
VALUES ('James Gosling', 'james', 'Test@123', 'active');

INSERT INTO users (name, login_name, password, status)
VALUES ('Ken Thompson', 'ken', 'Test@123', 'active');

INSERT INTO users (name, login_name, password, status)
VALUES ('Dennis Ritchie', 'dennis', 'Test@123', 'active');