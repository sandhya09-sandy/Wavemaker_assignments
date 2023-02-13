CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `empid` int DEFAULT NULL,
  `mobilenum` int DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `genderid` int DEFAULT NULL,
  `emp_role` varchar(100) DEFAULT NULL,
  `relationid` int DEFAULT NULL,
  `gpapid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_FK` (`gpapid`),
  KEY `user_FK_1` (`genderid`),
  CONSTRAINT `user_FK` FOREIGN KEY (`gpapid`) REFERENCES `gpap1` (`gpappid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_FK_1` FOREIGN KEY (`genderid`) REFERENCES `gender` (`genid`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `gpap1` (
  `gpappid` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `relation_id` int DEFAULT NULL,
  PRIMARY KEY (`gpappid`),
  KEY `gpap1_FK` (`relation_id`),
  CONSTRAINT `gpap1_FK` FOREIGN KEY (`relation_id`) REFERENCES `relationstat` (`relationid`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `gender` (
  `genid` int NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`genid`)
);


CREATE TABLE `cyclemng` (
  `cycleid` int NOT NULL,
  `start` int DEFAULT NULL,
  `end` int DEFAULT NULL,
  `userid` int DEFAULT NULL,
  `topup_id` int DEFAULT NULL,
  PRIMARY KEY (`cycleid`),
  KEY `cyclemng_FK` (`userid`),
  KEY `cyclemng_FK_1` (`topup_id`),
  CONSTRAINT `cyclemng_FK` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cyclemng_FK_1` FOREIGN KEY (`topup_id`) REFERENCES `topup1` (`topupid`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `relationstat` (
  `relationid` int NOT NULL,
  `reltype` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`relationid`)
);


CREATE TABLE `topup1` (
  `topupid` int NOT NULL,
  `amount` float DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`topupid`)
);


CREATE TABLE `dependent` (
  `dependentid` int NOT NULL,
  `dependentname` varchar(100) DEFAULT NULL,
  `relationid` int DEFAULT NULL,
  `userid` int DEFAULT NULL,
  `cycle_id` int DEFAULT NULL,
  PRIMARY KEY (`dependentid`),
  KEY `dependent_FK` (`relationid`),
  KEY `dependent_FK_1` (`userid`),
  KEY `dependent_FK_2` (`cycle_id`),
  CONSTRAINT `dependent_FK` FOREIGN KEY (`relationid`) REFERENCES `relationstat` (`relationid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dependent_FK_1` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dependent_FK_2` FOREIGN KEY (`cycle_id`) REFERENCES `cyclemng` (`cycleid`) ON DELETE CASCADE ON UPDATE CASCADE
);


INSERT INTO USER values(1,"sandhya",101,6300631755,"kategarsandhya@gmail.com",2002-06-18,2,"fresher",1,3); 
INSERT INTO USER values(2,"ramya",102,6300631766,"kategarramya@gmail.com",2002-05-10,2,"employee",1,3); 
INSERT INTO USER values(1,"anjali",103,6300631777,"kategaranjali@gmail.com",2002-07-11,2,"employee",1,3); 
INSERT INTO USER values(1,"rishika",104,6300631788,"rishika@gmail.com",2002-08-08,2,"lead",1,3); 
INSERT INTO USER values(1,"manisha",105,6300631799,"manisha@gmail.com",2002-06-15,2,"manager",1,3); 


INSERT INTO gpap1 values(1,"sandhya",1);
INSERT INTO gpap1 values(2,"ramya",2);
INSERT INTO gpap1 values(3,"anjali",3);
INSERT INTO gpap1 values(4,"rishika",1);
INSERT INTO gpap1 values(5,"manisha",4);

INSERT intp gender values(1,"male");
INSERT INTO gender values(2,"female");

INSERT INTO cyclemng values(1,2015,2016,1,2);
INSERT INTO cyclemng values(2,2016,2017,2,2);
INSERT INTO cyclemng values(3,2017,2018,3,2);
INSERT INTO cyclemng values(4,2016,2017,4,2);
INSERT INTO cyclemng values(5,2015,2016,5,2);


INSERT INTO relationstat values(1,"father");
INSERT INTO relationstat values(2,"mother");
INSERT INTO relationstat values(3,"sister");
INSERT INTO relationstat values(4,"brother");
INSERT INTO relationstat values(5,"sisterinlaw");
INSERT INTO relationstat values(6,"brotherinlaw");


INSERT INTO topup1(1,50,000);
INSERT INTO topup1(2,60,000);
INSERT INTO topup1(3,70,000);
INSERT INTO topup1(4,80,000);
INSERT INTO topup1(5,90,000);

INSERT INTO dependent(1,"venkatesh",1,1,2);
INSERT INTO dependent(2,"lakshmi",2,3,3);
INSERT INTO dependent(1,"ramesh",4,2,1);
INSERT INTO dependent(1,"ram",6,4,4);
INSERT INTO dependent(1,"venu",1,2,3);
