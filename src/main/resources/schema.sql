CREATE TABLE rooms
(
hotelid int NOT NULL,
roomid int NOT NULL,
roomname varchar(50),
isitfree boolean,
smoking boolean,
datefrom date,
dateuntil date
);