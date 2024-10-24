select * from students order by "studentId" 
select * from students order by "studentId" asc;
select * from students order by "studentId" desc;

select * from students order by "courseId","studentId";

select * from students order by "courseId" desc ,"studentId";
select * from students order by "courseId","studentId" desc;
select * from students order by "courseId","studentId" desc limit 5;


select * from students;

// joins

select s."studentId", s."studentName", c."courseName"
from students s join courses c on s."courseId" =c."courseId";