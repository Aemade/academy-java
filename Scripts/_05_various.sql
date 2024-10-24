
/*
 * DISTINCT
 */

SELECT distinct "courseId" 
FROM "students" 
ORDER BY "courseId"

SELECT distinct "studentId", "courseId" 
FROM "students" 
ORDER BY "courseId"

SELECT distinct  "courseId", "studentName" 
FROM "students" 
ORDER BY "courseId"

/*
 * UNION
 */

select * from students where "studentId" > 15
UNION
select * from students where "studentId" < 20;

/*
 * INTERSECT
 */

select * from students where "studentId" > 15
INTERSECT
select * from students where "studentId" < 20;

/*
 * EXCEPT
 */

select * from students where "studentId" > 15
EXCEPT
select * from students where "studentId" <= 20 order by "studentId";
