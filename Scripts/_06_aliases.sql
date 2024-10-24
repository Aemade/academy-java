
/*
 * We can use aliases for table names and column names.
 */
SELECT "studentId" as "Id", "courseId", "studentName" as "Name", "studentEmail" as "Email", "studentPhone"
FROM students as s
where s."studentId" > 15