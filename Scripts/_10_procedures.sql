CREATE OR REPLACE PROCEDURE insertStudent("_courseId" INTEGER, "_studentName" VARCHAR, "_studentEmail" VARCHAR, "_studentPhone" INTEGER)
LANGUAGE plpgsql
AS
$$
    BEGIN
        INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone") VALUES ("_courseId", "_studentName", "_studentEmail", "_studentPhone");
    END;
$$;

-- Let's call this function and insert a student:
CALL insertStudent(1, 'Ray Panamero', 'ray@panamero.com', 38173);

-- Call it again
CALL insertStudent(15, 'Hrithik', 'hk@gmail.com', 589159);



CREATE OR REPLACE PROCEDURE insertBulkStudents("_courseId" INTEGER)
LANGUAGE plpgsql
AS
$$
    DECLARE
        randomNumberStartLimit INTEGER;
        randomNumberEndLimit INTEGER;
        randomNumberGenerated INTEGER;
    BEGIN
        randomNumberStartLimit = 10000;
        randomNumberEndLimit = 20000;
        FOR _index IN 1..50 LOOP
        randomNumberGenerated = floor(random() * (randomNumberStartLimit-randomNumberEndLimit + 1) + randomNumberEndLimit);
        INSERT INTO "students"("courseId", "studentName", "studentEmail", "studentPhone") VALUES ("_courseId",concat('Student',_index),concat('student',_index,'@gmail.com'),randomNumberGenerated);
        END LOOP;
    END;
$$;

-- Let's call this procedure and perform the bulk insert:
CALL insertBulkStudents(10);

-- concat('Student',_index)   Student1, Student2, Stundent3

-- We call the procedure using CALL keyword
-- We do not have a return expression within the stored procedure
-- We can use stored procedure for performing DML operation such as SELECT, INSERT, UPDATE AND DELETE




