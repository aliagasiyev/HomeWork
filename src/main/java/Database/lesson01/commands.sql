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
FROM Employees
WHERE department = 'IT';

SELECT *
FROM Employees
Order By last_name;

SELECT *
FROM Employees
ORDER BY last_name;

SELECT *
FROM Employees
where department = 'IT'
  AND age > 40;

SELECT *FROM Employees
where department='HR' OR salary>55000;

SELECT *FROM Employees
WHERE NOT department ='Marketing';

UPDATE Employees
SET salary =55000
WHERE employe_id=1;
SELECT *FROM Employees;

DROP TABLE Employees;

-- ATTENTION HERE ATTENTION HERE
DELETE FROM Employees
WHERE employe_id=2;

-- PAY ATTENTION HERE !!!!!!!!
SELECT * FROM Employees
ORDER BY salary DESC
    LIMIT 3;

SELECT MIN(salary)
FROM Employees;

SELECT MAX(salary)
FROM employees;

SELECT COUNT(department)
FROM  Employees
WHERE department='IT';

SELECT SUM(salary)
FROM Employees
WHERE department='Sales';

SELECT AVG(salary)
FROM Employees;

SELECT *FROM Employees
where first_name LIKE 'J%';

