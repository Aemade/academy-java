
BEGIN
-- This code will be committed no matter what, because we've run the COMMIT command:

INSERT INTO "accounts"("name", "balance")
VALUES('Alice1', 10000);

select * from accounts;

-- This code is uncommitted, but we do establish a SAVEPOINT:
UPDATE "accounts" 
SET "balance" = "balance" - 1500
WHERE "id" = 11;

SAVEPOINT A;

-- This code doesn't belong to SAVEPOINT A. It will only be reflected if we COMMIT or ROLLBACK TO B:
INSERT INTO "accounts"("name", "balance")
VALUES('Bob1', 10000);

SAVEPOINT B;

-- This code doesn't belong to SAVEPOINT A or B. It will only be reflected if we COMMIT or ROLLBACK TO C:
INSERT INTO "accounts"("name", "balance")
VALUES('Carlos1', 10000);

SAVEPOINT C;

-- This command effectively returns our code to the state it was in when line 10 was run:
ROLLBACK TO A;

commit;
