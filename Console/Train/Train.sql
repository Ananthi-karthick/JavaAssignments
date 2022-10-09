create database TrainTicketBooking;
create table train(trainno	int primary key auto_increment,train_name varchar(30),train_from varchar(25),train_to varchar(25),ticket_count int,ticket_cost int);
alter table train auto_increment=122344;
insert into train(train_name,train_from,train_to,ticket_count,ticket_cost) values('ThanjaiExpress','Rameswaram','Thanjavur','100','300'),('ErodeExpress','Trichy','Erode','100','400'),('YamunaiExpress','Kaniyakumari','Chennai','100','500'),('MaruthamExpress','Salem','Thanjavur','100','350');
select *from train;




