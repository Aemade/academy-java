CREATE TABLE "User"
(
    "userId" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "firstName" character varying NOT NULL,
    "lastName" character varying NOT NULL,
    "username" character varying NOT NULL,
    "phone" character varying NOT NULL,
    "emailId" character varying NOT NULL,
    "password" character varying NOT NULL,
    "emailVerified" boolean NOT NULL,
    "createdOn" timestamp without time zone NOT NULL,
    CONSTRAINT "User_pkey" PRIMARY KEY ("userId"),
    CONSTRAINT "User_emailId_key" UNIQUE ("emailId"),
    CONSTRAINT "User_username_key" UNIQUE ("username")
);

-- Insert script
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn") VALUES ('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', true, NOW());
;

-- Select script
SELECT * FROM "User";

-- Insert multiple users with a single query using a VALUES list
INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
       ('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
       ('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());

--select all rows from the "User" table where the value of the "emailVerified" column is true.
SELECT * FROM "User" WHERE "emailVerified" = true;

-- Insert a few more users

INSERT INTO "User" ("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
VALUES ('James', 'Williams', 'jameswilliams', '+1-556-9010', 'jameswilliams@example.com', 'password123', true,NOW()),
('Mary', 'Anderson', 'maryanderson', '+1-557-3657', 'maryanderson@example.com', 'password123', false, NOW()),
('Patricia', 'Jackson', 'patriciajackson', '+1-633-3556', 'patriciajackson@example.com', 'password123', false, NOW()),
('John', 'Davis', 'johndavis', '+1-631-3576', 'johndavis@example.com', 'password123', false, NOW());

-- Update script
UPDATE "User" SET "username"='randyjones' WHERE "username" = 'tomjones';

-- Select script
SELECT * FROM "User" WHERE "username" = 'randyjones';

-- Delete script
DELETE FROM "User" WHERE "username" = 'randyjones';

-- Select script
SELECT * FROM "User";
