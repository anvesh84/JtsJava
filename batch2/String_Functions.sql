-- String functions 

instr() : Displays the first occurence of given char. 

select instr('keerthi','e')

length() : Displays the length of string 

select length('anvesh');

select Ename, Length(EName) from Emp;

left() : Displays no.of left-side chars. 

select left('hemanth',4);

right() : Displays no.of right-side chars. 

select right('hemanth',4) 

lower() : Displays in lower-case 

select lower('Hemanth') 

upper() : Displays in upper-case 

select upper('hemanth') 

/* replace() : used to replace old string/char with 
new string/char in all occurrences */

select replace('Java Training','Java','Sql');

/* substring() : Display's the part of string */ 

select substring('welcome',2,3) 
