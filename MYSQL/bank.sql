create database bank;
use bank;
CREATE TABLE users (
    id INT not null AUTO_INCREMENT,
    username VARCHAR(10) NOT NULL UNIQUE,
    full_name VARCHAR(20) NOT NULL,
    gender CHAR(1) ,
    dob DATE NOT NULL,
    created_by INT NULL,
  created_at DATETIME NULL,
  updated_by INT NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE users
ADD COLUMN mobile VARCHAR(15) NULL AFTER dob;

CREATE TABLE accounts (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    full_name VARCHAR(25),
    account_no VARCHAR(12) UNIQUE,
    account_type VARCHAR(10),
    rate_of_interest Double,
    balance  double,
    withdraw double,
    deposit double,
    created_by INT NULL,
  created_at DATETIME NULL,
  updated_by INT NULL,
  updated_at DATETIME NULL,
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);
