
/*
 * The following query will return the count of the courseId column.
 */
select "courseId", count("courseId") 
from students
where "courseId" > 0
group by "courseId" 
order by "courseId";

/*
 * example of using the having clause
 */
select "courseId", count("courseId") 
from students
where "courseId" > 0
group by "courseId" 
having count("courseId") > 2
order by "courseId";

/*
 * The following query will return the average of the studentId column.
 */

select avg("studentId") from students;

/*
 * example with join
 */

SELECT courses."courseName", COUNT(students."studentId") AS "totalStudents"
FROM "courses" 
JOIN "students"  ON courses."courseId" = students."courseId"
GROUP BY courses."courseName"
HAVING COUNT(students."studentId") > 1;

/*
 * example with join an aliases
 */ 

SELECT c."courseName", COUNT(s."studentId") AS "totalStudents"
FROM "courses" c
JOIN "students" s ON c."courseId" = s."courseId"
GROUP BY c."courseName"
HAVING COUNT(s."studentId") > 1;


