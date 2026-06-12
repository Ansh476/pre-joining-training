-- DISTINCT

SELECT DISTINCT city FROM Customers;
SELECT DISTINCT category FROM Products;

-- WHERE

SELECT * FROM Customers
WHERE city = 'Mumbai';

SELECT product_id, product_name FROM Products
WHERE price > 10000;

-- AND

SELECT * FROM Products
WHERE category = 'Electronics' and price > 25000;

-- OR

SELECT cust_name FROM Customers
WHERE city = 'Delhi' OR city = 'Hyderabad';


-- ORDER BY

SELECT product_name FROM Products
ORDER BY price;

SELECT prod_id FROM Orders
ORDER BY quantity DESC;


-- LIKE

SELECT email FROM Customers
WHERE cust_name LIKE 's%'; -- starts with

SELECT product_name FROM Products
WHERE category LIKE '%ni%'; -- contains ni

SELECT cust_id,cust_name FROM Customers
WHERE cust_name LIKE '%h';   -- ends with

SELECT * FROM Orders
WHERE prod_id LIKE 'P_'; -- only 1 char after P

-- IN

SELECT * FROM Products
WHERE category IN ('Furniture','Fashion');

-- BETWEEN

SELECT cust_name FROM Customers
WHERE cust_id BETWEEN 102 AND 105; -- inclusive

-- alias

SELECT cust_name AS cname FROM Customers; 

SELECT product_name AS Prodname, price AS cost FROM Products;

-- LIMIT

SELECT * FROM Orders
LIMIT 3;




