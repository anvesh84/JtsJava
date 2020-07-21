use jts;

show tables;

-- Display information about Emp table 

DESC Emp;

-- Display all recods from Emp Table 

SELECT * FROM EMP;

-- Display Empno, Ename, Sal from Emp Table

SELECT
	Empno,
    Ename,
    Sal
FROM EMP;

-- Dispaly all records whose sal > 1500

SELECT * FROM EMP
WHERE SAL > 1500;

-- Display All records whose JOB is 'CLERK'

SELECT * FROM EMP
WHERE JOB='CLERK';

-- BETWEEN AND : Used to display records from 
-- start to end range

SELECT * FROM EMP 
WHERE SAL BETWEEN 1000 AND 3000;

SELECT * FROM EMP 
WHERE SAL NOT BETWEEN 1000 AND 3000;

/* IN clause : Used to display specific column
values */

-- Display emp records whose ENAME is 
-- 'Scott' or 'ford' or king'

SELECT * FROM EMP WHERE 
ENAME IN('SCOTT','FORD','KING');

SELECT * FROM EMP WHERE 
ENAME NOT IN('SCOTT','FORD','KING');

/* LIKE : Used to display data w.r.t. wild cards */ 

SELECT * FROM EMP WHERE 
ENAME LIKE 'S%';

SELECT * FROM EMP WHERE 
ENAME LIKE '%T';

-- ORDER By : Used to display table records
-- w.r.t. Specific fields in ascending/descending
-- order 

SELECT EMPNO,ENAME,JOB,SAL,HIREDATE
FROM EMP ORDER BY JOB;

SELECT EMPNO,ENAME,JOB,SAL,HIREDATE
FROM EMP ORDER BY JOB, ENAME;

SELECT EMPNO,ENAME,JOB,SAL,HIREDATE
FROM EMP ORDER BY JOB DESC, ENAME;

select distinct job from Emp;

WRITE A Query as Generate City as 
if Job is SALESMAN then CITY  is 'Delhi'
if jo is CLERK then CITY is 'Hyd'
if job is MANAGER then CITy is 'PUNE'
if job is ANALYST THEN CITY is 'Bangalore'
else CITY is 'Mumbai'


SELECT EMPNO, ENAME, JOB, SAL,
CASE JOB
  WHEN 'CLERK' THEN 'Hyd'
  WHEN 'MANAGER' THEN 'PUNE'
  WHEN 'ANALYST' THEN 'Bangalore'
  WHEN 'SALESMAN' THEN 'Delhi'
  ELSE 'Mumbai'
END city
FROM EMP;


SELECT EMPNO, ENAME, JOB, SAL,COMM,
CASE 
WHEN COMM IS NULL THEN SAL
ELSE SAL+COMM 
END 'TakeHome'
FROM EMP;

SELECT EMPNO, ENAME, JOB, SAL,COMM,
CASE 
WHEN COMM IS NULL THEN 0
ELSE COMM 
END 'UpdComm'
FROM EMP;



