
-- Run the following code to define the function (aka procedure) auditStudentFunc:
CREATE OR REPLACE FUNCTION auditStudentFunc() RETURNS TRIGGER AS $$
   BEGIN
      INSERT INTO "studentAudit"("studentId", "studentEnrolledDate") VALUES (new."studentId", current_timestamp);
      RETURN NEW;
   END;
$$ LANGUAGE plpgsql;

-- Create the trigger "auditTrigger," which will utilize the logic we wrote for the auditStudentFunc procedure:
CREATE TRIGGER "auditTrigger" AFTER INSERT ON "students"
FOR EACH ROW EXECUTE PROCEDURE auditStudentFunc();


DROP TRIGGER IF EXISTS "auditTrigger" ON students CASCADE;

INSERT INTO public.students
("courseId", "studentName", "studentEmail", "studentPhone")
VALUES(3, 'Carlos', 'carlos7@gmail.com', '12345');