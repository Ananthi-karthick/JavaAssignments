create database UserDetails;
create table userInfo
(Acc_No int auto_increment primary key,Acc_Holder_Name varchar(20) not Null,Current_Amount long,
ContactNo varchar(20),EmailId varchar(20), User_Name varchar(20) Not Null,Password int Not Null);
ALTER TABLE userInfo AUTO_INCREMENT=1001;
Insert into userInfo (Acc_Holder_Name,Current_Amount,ContactNo,EmailId,User_Name,Password) values
("Jayaseeli","51000","0987658","jayaseeli@gamil.com","jaya","0987"),
("Karthick","50000","28492847","karthick@gamil.com","Karthick","1234");
Drop table userInfo;
select * from userInfo;
