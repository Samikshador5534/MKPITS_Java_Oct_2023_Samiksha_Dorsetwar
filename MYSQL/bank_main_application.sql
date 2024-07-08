create database bank_main_application;
use bank_main_application;

CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(45) NOT NULL,
    middle_name VARCHAR(45),
    last_name VARCHAR(45) NOT NULL,
    mobile_number VARCHAR(10) NOT NULL,
    email VARCHAR(50) NOT NULL,
    gender CHAR(1) NOT NULL,
    date_of_birth DATE NOT NULL,
    cin VARCHAR(20) NOT NULL,
    adhaar_card VARCHAR(12) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT
);

CREATE TABLE address (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    address TEXT,
    pincode VARCHAR(7) NOT NULL,
    city_id INT NOT NULL,
    district_id INT NOT NULL,
    state_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (city_id) REFERENCES cities(id),
    FOREIGN KEY (district_id) REFERENCES districts(id),
    FOREIGN KEY (state_id) REFERENCES states(id)
);

CREATE TABLE user_credential (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    user_name VARCHAR(10) NOT NULL,
    password VARCHAR(200) NOT NULL,
    password_salt VARCHAR(100) NOT NULL,
    user_role ENUM('Admin', 'Employee', 'Customer') NOT NULL,
    login_date_time DATETIME NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE account (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    account_type VARCHAR(10) NOT NULL,
    balance DECIMAL(15,2) NOT NULL,
    account_number VARCHAR(14) NOT NULL,
    rate_of_interest DECIMAL(5,2) NOT NULL,
    branch_id INT NOT NULL,
    opening_date DATE NOT NULL,
    closing_date DATE,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (branch_id) REFERENCES branch(id)
);

CREATE TABLE state (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    code INT NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT
);

CREATE TABLE district (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    code INT NOT NULL,
    state_id INT NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (state_id) REFERENCES state(id)
);

CREATE TABLE city (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    code INT NOT NULL,
    district_id INT NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (district_id) REFERENCES district(id)
);

		CREATE TABLE branch (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    code INT NOT NULL,
    ifsc_code VARCHAR(10) NOT NULL,
    city_id INT NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (city_id) REFERENCES city(id)
);

CREATE TABLE transaction (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    account_number VARCHAR(14) NOT NULL,
    remarks TEXT NOT NULL,
    transaction_date_time DATETIME NOT NULL,
    transaction_type ENUM('Credit', 'Debit') NOT NULL,
    transaction_status VARCHAR(12) NOT NULL,
    created_at DATETIME NOT NULL,
    created_by INT NOT NULL,
    updated_at DATETIME,
    updated_by INT,
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    emp_id INT,
    first_name CHAR(45) NOT NULL,
    middle_name CHAR(45),
    last_name CHAR(45) NOT NULL,
    job_title VARCHAR(45) NOT NULL,
    department VARCHAR(45) NOT NULL,
    email VARCHAR(50) NOT NULL,
    mobile INT(15) NOT NULL,
    hire_date DATE NOT NULL,
    salary DECIMAL(15,2) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME ON UPDATE CURRENT_TIMESTAMP
);

drop table employee;


-- Inserting data into user table
INSERT INTO user (first_name, middle_name, last_name, mobile_number, email, gender, date_of_birth, cin, adhaar_card, created_at, created_by, updated_at, updated_by) VALUES
('John', 'A', 'Doe', '1234567890', 'john.doe@example.com', 'M', '1985-01-01', 'CIN123456', '123456789012', NOW(), 1, NOW(), 1),
('Jane', 'B', 'Smith', '2345678901', 'jane.smith@example.com', 'F', '1990-02-02', 'CIN654321', '234567890123', NOW(), 1, NOW(), 1),
('Jim', NULL, 'Beam', '3456789012', 'jim.beam@example.com', 'M', '1988-03-03', 'CIN789012', '345678901234', NOW(), 1, NOW(), 1),
('Anna', 'C', 'Taylor', '4567890123', 'anna.taylor@example.com', 'F', '1992-04-04', 'CIN012345', '456789012345', NOW(), 1, NOW(), 1),
('Mike', 'D', 'Brown', '5678901234', 'mike.brown@example.com', 'M', '1987-05-05', 'CIN987654', '567890123456', NOW(), 1, NOW(), 1);

-- Inserting data into address table
INSERT INTO address (user_id, address, pincode, city_id, district_id, state_id) VALUES
(1, '123 Main St, Apt 1', '100001', 1, 1, 1),
(2, '456 Oak St, Apt 2', '100002', 2, 2, 2),
(3, '789 Pine St, Apt 3', '100003', 3, 3, 3),
(4, '101 Maple St, Apt 4', '100004', 4, 4, 4),
(5, '202 Birch St, Apt 5', '100005', 5, 5, 5);

-- Inserting data into user_credential table
INSERT INTO user_credential (user_id, user_name, password, password_salt, user_role, login_date_time, created_at, created_by, updated_at, updated_by) VALUES
(1, 'admin1', 'hashed_password1', 'salt1', 'Admin', NOW(), NOW(), 1, NOW(), 1),
(2, 'employee1', 'hashed_password2', 'salt2', 'Employee', NOW(), NOW(), 1, NOW(), 1),
(3, 'customer1', 'hashed_password3', 'salt3', 'Customer', NOW(), NOW(), 1, NOW(), 1),
(4, 'admin2', 'hashed_password4', 'salt4', 'Admin', NOW(), NOW(), 1, NOW(), 1),
(5, 'employee2', 'hashed_password5', 'salt5', 'Employee', NOW(), NOW(), 1, NOW(), 1);

-- Inserting data into account table
INSERT INTO account (user_id, account_type, balance, account_number, rate_of_interest, branch_id, opening_date, created_at, created_by, updated_at, updated_by) VALUES
(1, 'Saving', 1000.50, '12345678901234', 3.5, 1, '2023-01-01', NOW(), 1, NOW(), 1),
(2, 'Current', 2500.75, '23456789012345', 4.0, 2, '2023-02-01', NOW(), 1, NOW(), 1),
(3, 'Saving', 1500.00, '34567890123456', 3.5, 3, '2023-03-01', NOW(), 1, NOW(), 1),
(4, 'Fixed', 5000.25, '45678901234567', 5.0, 4, '2023-04-01', NOW(), 1, NOW(), 1),
(5, 'Current', 3000.50, '56789012345678', 4.0, 5, '2023-05-01', NOW(), 1, NOW(), 1);

-- Inserting data into state table
INSERT INTO state (name, code, created_at, created_by, updated_at, updated_by) VALUES
('State1', 1001, NOW(), 1, NOW(), 1),
('State2', 1002, NOW(), 1, NOW(), 1),
('State3', 1003, NOW(), 1, NOW(), 1),
('State4', 1004, NOW(), 1, NOW(), 1),
('State5', 1005, NOW(), 1, NOW(), 1);

-- Inserting data into district table
INSERT INTO district (name, code, state_id, created_at, created_by, updated_at, updated_by) VALUES
('District1', 2001, 1, NOW(), 1, NOW(), 1),
('District2', 2002, 2, NOW(), 1, NOW(), 1),
('District3', 2003, 3, NOW(), 1, NOW(), 1),
('District4', 2004, 4, NOW(), 1, NOW(), 1),
('District5', 2005, 5, NOW(), 1, NOW(), 1);

-- Inserting data into city table
INSERT INTO city (name, code, district_id, created_at, created_by, updated_at, updated_by) VALUES
('City1', 3001, 1, NOW(), 1, NOW(), 1),
('City2', 3002, 2, NOW(), 1, NOW(), 1),
('City3', 3003, 3, NOW(), 1, NOW(), 1),
('City4', 3004, 4, NOW(), 1, NOW(), 1),
('City5', 3005, 5, NOW(), 1, NOW(), 1);

-- Inserting data into branch table
INSERT INTO branch (name, code, ifsc_code, city_id, created_at, created_by, updated_at, updated_by) VALUES
('Branch1', 4001, 'IFSC0001', 1, NOW(), 1, NOW(), 1),
('Branch2', 4002, 'IFSC0002', 2, NOW(), 1, NOW(), 1),
('Branch3', 4003, 'IFSC0003', 3, NOW(), 1, NOW(), 1),
('Branch4', 4004, 'IFSC0004', 4, NOW(), 1, NOW(), 1),
('Branch5', 4005, 'IFSC0005', 5, NOW(), 1, NOW(), 1);

-- Inserting data into transaction table
INSERT INTO transaction (user_id, account_number, remarks, transaction_date_time, transaction_type, transaction_status, created_at, created_by, updated_at, updated_by) VALUES
(1, '12345678901234', 'Salary Credit', NOW(), 'Credit', 'Success', NOW(), 1, NOW(), 1),
(2, '23456789012345', 'Bill Payment', NOW(), 'Debit', 'Success', NOW(), 1, NOW(), 1),
(3, '34567890123456', 'Cash Deposit', NOW(), 'Credit', 'Pending', NOW(), 1, NOW(), 1),
(4, '45678901234567', 'Online Transfer', NOW(), 'Debit', 'Failed', NOW(), 1, NOW(), 1),
(5, '56789012345678', 'Shopping Payment', NOW(), 'Debit', 'Success', NOW(), 1, NOW(), 1);





