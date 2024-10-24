


/* the order by is ascending by default */

select * from students order by "studentId";

select * from students order by "studentId" asc; 

/* the order by is descending */
select * from students order by "studentId" desc;

select * from students order by "courseId", "studentId";

/* order by courseId desc and studentId asc */
select * from students order by "courseId" desc, "studentId";

/* order by courseId and studentId desc */
select * from students order by "courseId", "studentId" desc;

select * from students order by "courseId", "studentId" asc;

/* order by with where clause */
select * from students where "studentId" > 15 order by "courseId", "studentId" asc;

