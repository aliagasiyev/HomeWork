CREATE TABLE Employees
(
    employe_id int,
    first_name varchar(255),
    last_name  varchar(255),
    age        int,
    department varchar(50),
    salary     int,
    hireDate   DATE
);
INSERT INTO Employees (employe_id, first_name, last_name, age, department, salary, hireDate)
VALUES (1, 'John', 'Doe', 30, 'Sales', 50000, '2018-01-15'),
       (2, 'Jane', 'Smith', 25, 'Marketing', 45000, '2019-02-18'),
       (3, 'Alice', 'Johnson', 35, 'IT', 60000, '2016-03-22'),
       (4, 'Chris', 'Brown', 28, 'Sales', 52000, '2020-04-25'),
       (5, 'Patricia', 'Taylor', 40, 'HR', 55000, '2015-05-30'),
       (6, 'Michael', 'Davis', 45, 'IT', 65000, '2014-06-15'),
       (7, 'Linda', 'Wilson', 32, 'Finance', 48000, '2021-07-10');



SELECT *
FROM Employees;

SELECT DISTINCT department
FROM Employees;

SELECT *
from Employees
WHERE age > 30;

SELECT *
FROM Employees
ORDER BY salary DESC;

DELETE
FROM Employees
WHERE employe_id = 7;

CREATE TABLE Products
(
    ProductID   INT PRIMARY KEY,
    ProductName VARCHAR(50),
    CategoryID  INT,
    Price       DECIMAL(10, 2)
);

-- Insert data into Products table
INSERT INTO Products (ProductID, ProductName, CategoryID, Price)
VALUES (1, 'Chais', 1, 18),
       (2, 'Chang', 1, 19),
       (3, 'Aniseed Syrup', 2, 10);

CREATE TABLE Categories
(
    CategoryID   INT PRIMARY KEY,
    CategoryName VARCHAR(50),
    Description  VARCHAR(255)
);

-- Insert data into Categories table
INSERT INTO Categories (CategoryID, CategoryName, Description)
VALUES (1, 'Beverages', 'Soft drinks, coffees, teas, beers, and ales'),
       (2, 'Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings'),
       (3, 'Confections', 'Desserts, candies, and sweet breads');

SELECT ProductID, ProductName, CategoryName
FROM Products
         INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID;


CREATE TABLE Products1
(
    ProductID   INT PRIMARY KEY,
    ProductName VARCHAR(50),
    CategoryID  INT,
    Price       DECIMAL(10, 2)
);

INSERT INTO Products1
VALUES (1, 'Pomidor', 1,    2.80),
       (2, 'Alma', 1,   0.90),
       (3, 'Qarpiz', 2,    1.20),
       (4,'Banan',5,   3.3);


CREATE TABLE Categories1
(
    CategoryID    INT PRIMARY KEY,
    CategoryName VARCHAR(50),
    Description  VARCHAR(255)
);

INSERT INTO Categories1
VALUES (1,'Bu Mehsul Terevezdir','Qirmizi Renglidir'),
       (2,'Bu Mehsul Meyvedir','Dadli sirin olur'),
       (3,'Bu Mehsul esil deniz mehsuludur','Deneli olur'),
       (12,'Bu Mehsul Product da yoxdur','Dadli Deil');



SELECT Products1.ProductID, Products1.ProductName,Categories1.CategoryName,Categories1.Description,Categories1.CategoryID,Products1.CategoryID
FROM Products1
         INNER JOIN Categories1 ON Products1.CategoryID=Categories1.CategoryID;


SELECT Products1.ProductID, Products1.ProductName,Categories1.CategoryName,Categories1.Description,Categories1.CategoryID,Products1.CategoryID
From Products1
         LEFT JOIN Categories1 ON  Products1.CategoryID=Categories1.CategoryID;


SELECT Products1.ProductID, Products1.ProductName,Categories1.CategoryName,Categories1.Description,Categories1.CategoryID,Products1.CategoryID
From Products1
         RIGHT JOIN  Categories1 ON  Products1.CategoryID=Categories1.CategoryID;


