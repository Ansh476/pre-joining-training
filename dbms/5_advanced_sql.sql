-- ALTER

ALTER TABLE Customers
ADD age INT;

UPDATE Customers
SET age = 22 WHERE cust_id = 102;

-- DROP

ALTER TABLE Customers
DROP COLUMN age;

-- TRUNCATE

TRUNCATE TABLE Cust_cities; -- deletes data

DROP TABLE Cust_cities ; -- deletes table

-- VIEW (virtual table)

CREATE VIEW Product_details AS
SELECT product_name,category,price FROM Products;

SELECT * FROM Product_details;

-- INDEX 

CREATE INDEX idx_email
ON Customers(email);

SHOW INDEX FROM Customers;

-- NULL

UPDATE Orders
SET quantity = NULL
WHERE prod_id = 'P2';

SELECT * FROM Orders 
WHERE quantity IS NULL;

SELECT order_id FROM Orders 
WHERE quantity IS NOT NULL;

Update Customers 
SET city = NULL
WHERE cust_id = 107;

SELECT cust_name,
IFNULL(city,'Unknown') 
FROM Customers;

-- Aggregate functions

-- SUM
SELECT SUM(price) AS total_price
FROM Products;

-- MAX
SELECT prod_id, MAX(quantity) AS max_quant
FROM Orders
GROUP BY prod_id;

-- MIN
SELECT prod_id, MIN(quantity) AS min_quant
FROM Orders
GROUP BY prod_id;

-- AVG
SELECT AVG(price) AS avg_price
FROM Products;

-- COUNT
SELECT COUNT(*) AS num_of_cust
FROM Customers;

-- GROUP BY
SELECT city,COUNT(*) AS city_count
FROM Customers
GROUP BY city;

SELECT category,SUM(price) AS total_cost
FROM Products
GROUP BY category;

-- HAVING CLAUSE

SELECT category,SUM(price) AS total_cost
FROM products
GROUP BY category
HAVING SUM(price) > 30000;

SELECT city,COUNT(*) AS city_count
FROM Customers
GROUP BY city
HAVING COUNT(*) > 1;
