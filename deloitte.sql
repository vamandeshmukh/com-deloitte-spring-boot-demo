CREATE TABLE student (
roll_no INT, 
student_name VARCHAR(40), 
marks INT,
CONSTRAINT pk_student PRIMARY KEY (roll_no));

SELECT * FROM student ORDER BY roll_no;

DROP TABLE student; 

INSERT INTO student (roll_no, student_name, marks) VALUES (101, 'Sonu', 98);
INSERT INTO student (roll_no, student_name, marks) VALUES (102, 'Monu', 96);
INSERT INTO student (roll_no, student_name, marks) VALUES (103, 'Tonu', 99);

-- comment 



CREATE TABLE employee (
employee_id INT, 
first_name VARCHAR(40), 
salary DOUBLE,
CONSTRAINT pk_emp PRIMARY KEY (employee_id));

INSERT INTO employee (employee_id, first_name, salary) VALUES (105, 'Sonu', 98000);
INSERT INTO employee (employee_id, first_name, salary) VALUES (106, 'Monu', 95000);
INSERT INTO employee (employee_id, first_name, salary) VALUES (107, 'Tonu', 89000);
INSERT INTO employee (employee_id, first_name, salary) VALUES (108, 'Ponu', 92000);

commit; 

SELECT * FROM employee ORDER BY employee_id;




SELECT * FROM emp_table;

INSERT INTO emp_table (employee_id, first_name, salary) VALUES (101, 'Sonu', 90000);
INSERT INTO emp_table (employee_id, first_name, salary) VALUES (102, 'Monu', 95000);
INSERT INTO emp_table (employee_id, first_name, salary) VALUES (103, 'Tonu', 85000);
INSERT INTO emp_table (employee_id, first_name, salary) VALUES (104, 'Ponu', 80000);
INSERT INTO emp_table (employee_id, first_name, salary) VALUES (105, 'Gonu', 99000);

SELECT * FROM emp_table ORDER BY employee_id;

