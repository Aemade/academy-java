

INSERT INTO "accounts"("name", "balance")
VALUES('Bob', 10000);

/*
 * Create a transaction
 */

BEGIN;

--INSERT INTO "accounts"("name", "balance")
--VALUES('Alice', 10000);

INSERT INTO "accounts"("name", "balance")
VALUES('Carlos1', 10000);

Select * from accounts;

COMMIT;
ROLLBACK;


--UPDATE public.students
--SET "courseId"=1000
--WHERE "studentId"=2;