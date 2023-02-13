use sandy;
create table depname2(
   departmentname varchar(255),
   depart_id int,
   PRIMARY KEY(depart_id)
);
create table depemp2(
   Fname varchar(255),
   Lname varchar(255),
   employee_id int,
   email varchar(255),
   depart_id int,
   PRIMARY KEY (employee_id),
   FOREIGN KEY(depart_id) REFERENCES depname2(depart_id)
);
insert into  depname2 values("Production",1001);
insert into depname2 values("Marketing" ,1002);
insert into depname2  values("Accounting",1003);
insert into depname2 values("Financing",1004);
select * from  depname2;

create table empadd2(
   street varchar(255),
   city varchar(255),
   state varchar(255),
   employee_id int
);
insert into depemp2 values("kategar","sandhya",101,"sandhya@gmail.com",1001);
insert into  depemp2 values("polusu","ramya", 102,"ramya@gmail.com",1002);
insert into depemp2 values("gujja","rishika", 103,"gujja@gmail.com",1003);
insert into depemp2 values("devasani","manisha", 104,"manisha@gmail.com",1004);
select * from depemp2;
insert into empadd2 values("old postalcolony","kurnool","telangana",101);
insert into empadd2 values("new postalcolony","kurnool","telangana",102);
select * from empadd2;

select * from depemp2 INNER JOIN empadd2 ON depemp2.employee_id=empadd2.employee_id;
select * from depemp2 LEFT JOIN empadd2 ON depemp2.employee_id=empadd2.employee_id;
select * from depemp2 RIGHT JOIN empadd2 ON depemp2.employee_id=empadd2.employee_id;



   
        