-- INNER JOIN 

SELECT c.cust_name,p.product_name,o.quantity
FROM Orders o
INNER JOIN Customers c
ON o.customer_id = c.cust_id
INNER JOIN Products p
ON o.prod_id = p.product_id;

-- LEFT JOIN

INSERT INTO Customers
VALUES (107,'Vivek','Vivek@gmail.com','Kerala');

SELECT c.cust_name,o.prod_id
FROM Customers c
LEFT JOIN Orders o
ON c.cust_id = o.customer_id;

-- RIGHT JOIN

INSERT INTO Products
VALUES ('P7','Chair','Furniture',4000);

SELECT o.order_id,p.product_name
FROM Orders o
RIGHT JOIN Products p
ON o.prod_id = p.product_id;

-- FULL JOIN using UNION

SELECT c.cust_name,o.order_id
FROM Customers c
LEFT JOIN Orders o
ON c.cust_id = o.customer_id
UNION
SELECT c.cust_name,o.order_id
FROM Customers c
RIGHT JOIN Orders o
ON c.cust_id = o.customer_id;

-- UNION

SELECT city FROM Customers 
UNION
SELECT category FROM Products;

-- UNION ALL

SELECT city FROM Customers
UNION ALL
SELECT category FROM Products;
