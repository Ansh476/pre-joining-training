-- INSERT 

INSERT INTO Customers
VALUES (106,'Vivek','vivek@gmail.com','Kerala');

INSERT INTO Products
VALUES ('P6','Headphones','Electronics',5000);

-- UPDATE 

UPDATE Customers SET city = 'Pune'
Where cust_id = 105;

-- DELETE

DELETE FROM Customers
where cust_id = 106;

-- CREATE TABLE USING SELECT 

CREATE TABLE Cust_cities AS
SELECT cust_name,city FROM Customers;

-- INSERT INTO TABLE

INSERT INTO Cust_cities 
SELECT cust_name,city FROM Customers
WHERE city = "Mumbai";

