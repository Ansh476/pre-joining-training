CREATE DATABASE IF NOT EXISTS demo;
USE demo;

CREATE TABLE Customers (
   cust_id INT PRIMARY KEY,
   cust_name VARCHAR(50) NOT NULL, 
   email VARCHAR(50) NOT NULL UNIQUE,
   city VARCHAR(50) 
);

CREATE TABLE Products(
    product_id VARCHAR(10) PRIMARY KEY,
    product_name VARCHAR(50) NOT NULL,
    category VARCHAR(30),
    price INT DEFAULT 'Unknown'
);

CREATE TABLE Orders(
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    prod_id VARCHAR(10) NOT NULL,
    quantity INT,

    FOREIGN KEY(customer_id) REFERENCES Customers(cust_id),
    FOREIGN KEY(prod_id) REFERENCES Products(product_id)
);

INSERT INTO Customers (cust_id,cust_name,email,city) VALUES
(101,'Ansh','ansh@gmail.com','Mumbai'),
(102,'Rakshit','rakshit@gmail.com','Hyderabad'),
(103,'Shraeyaa','shraeyaa@gmail.com','Banglore'),
(104,'Nitish','nitish@gmail.com','Mumbai'),
(105,'Eesha','eesha@gmail.com','Delhi');

INSERT INTO Products VALUES
('P1','Smartphone','Electronics',30000),
('P2','Laptop','Electronics',50000),
('P3','Table','Furniture',15000),
('P4','Wardrobe','Furniture',20000),
('P5','Clothes','Fashion',3000);

INSERT INTO Orders (customer_id,prod_id,quantity) VALUES
(101,'P2',1),
(102,'P1',2),
(103,'P4',1),
(104,'P3',1),
(105,'P5',3),
(102,'P5',2);

SELECT * FROM Customers;
SELECT product_name,price FROM Products; 

