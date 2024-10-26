-- Listed below are the queries to create table.

-- DROP TABLE IF EXISTS "Profile";

CREATE TABLE "Profile"
(
    "profileId" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "userId" integer NOT NULL,
    "headline" character varying NOT NULL,
    "bio" character varying,
    "city" character varying,
    "country" character varying,
    "picture" character varying NOT NULL,
    CONSTRAINT "Profile_pkey" PRIMARY KEY ("profileId"),
    CONSTRAINT "Profile_userId_fkey" FOREIGN KEY ("userId")
        REFERENCES "User" ("userId")
);

-- Insert script
INSERT INTO "Profile"("userId", "headline", "bio", "city", "country", "picture")
VALUES (2, 'Wondergirl Amy!', 'My name is Amy and I am a super hero.', 'Toronto', 'Canada', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg'); 
	   
-- Select script
SELECT * FROM "Profile";

-- Insert script
INSERT INTO "Profile"("userId", "headline", "bio", "city", "country", "picture")
	VALUES (1, 'headline 1', 'bio 1', 'Calgary', 'Canada','picture1.jpg'), 
	       (2, 'headline 2', 'bio 2', 'Edmonton', 'Canada','picture2.jpg');

-- Select script
SELECT * FROM "Profile" WHERE "country" = 'Canada';

-- Update script
UPDATE "Profile" SET "bio"= 'I am Amy and I probably shouldn''t tell anyone I''m a super hero' WHERE "userId" = 2;

-- Delete script
DELETE FROM "Profile" WHERE "profileId" = 3;

-- Select script
SELECT * FROM "Profile";

-- Select script
SELECT * FROM "Profile" WHERE "userId" = 2;

-- Outer join script
SELECT * FROM "User" u LEFT OUTER JOIN "Profile" p ON u."userId" = p."userId";

-- Inner join script
SELECT * FROM "User" u JOIN "Profile" p ON u."userId" = p."userId";


