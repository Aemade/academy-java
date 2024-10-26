
-- Standard VIEW

-- Creating a view for students that have a phone number
CREATE VIEW "students_view" AS
SELECT "studentId", "courseId", "studentName", "studentEmail", "studentPhone" 
FROM "students" WHERE "studentPhone" IS NOT NULL;


-- Call the view created
SELECT * FROM "students_view"
where "studentId" > 10;




