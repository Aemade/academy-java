

select * from students s join courses c on s."courseId" = c."courseId";

/*
 * the following query joins students and courses tables
 * normally we join PK and FK columns
 */

/* INNER JOIN EXAMPLE*/
select s."studentId", s."studentName", c."courseName" 
from students s join courses c on s."courseId" = c."courseId";

select s."studentId", s."studentName", c."courseName" 
from students s inner join courses c on s."courseId" = c."courseId";

select s."studentId", s."studentName", c."courseName" 
from students s, courses c 
where s."courseId" = c."courseId" and s."studentId" > 10;

/* RIGHT JOIN EXAMPLE*/
select s."studentId", s."studentName", c."courseId", c."courseName" 
from "students" as s right join "courses" as c on s."courseId" = c."courseId";

/* LEFT JOIN EXAMPLE*/
select s."studentId", s."studentName", c."courseId", c."courseName" 
from "students" as s left join "courses" as c on s."courseId" = c."courseId";

select c."courseId", c."courseName", s."studentId", s."studentName" 
from "courses" as c left join "students" as s on s."courseId" = c."courseId";

/* FULL JOIN EXAMPLE*/
select s."studentId", s."studentName", c."courseId", c."courseName" 
from "students" as s full join "courses" as c on s."courseId" = c."courseId";


/*
select * from students where "studentId" > 15
INTERSECT
select * from students where "studentId" < 20;




INSERT INTO public.courses
("courseName")
VALUES('Hello World');

