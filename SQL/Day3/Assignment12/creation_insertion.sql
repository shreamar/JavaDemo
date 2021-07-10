use imcs;
create table Trainer
(
trainerId int primary key,
trainerName varchar(50),
emailID varchar(50) unique,
phone varchar(15)
);

create table Course_Details
(
 courseId char(3) primary key,
 courseName varchar(50) not null
);

create table Batch_Schedule
(
batchName varchar(8) ,
courseId char(3) ,
startDate date not null,
endDate date not null,
foreign key (courseId) references Course_Details(courseId),
primary key(batchName, courseId)
);

create table Feedback
(
trainerId int ,
courseId char(3),
batchName varchar(8),
FBRate double not null check(0 < FBRate <= 5),
foreign key (trainerId) references Trainer(trainerId),
foreign key (courseId) references Course_Details(courseId),
foreign key (batchName) references Batch_Schedule(batchName),
primary key(trainerId, courseId, batchName)
);


/* Inserting into Trainer table */
insert into Trainer(trainerId, trainerName, emailID, phone) values(1, 'Abraham', 't1@i.com','9844499999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(2, 'Boyce', 't2@i.com','9844499989');
insert into Trainer(trainerId, trainerName, emailID, phone) values(3, 'camilla', 't3@i.com','9844499997');
insert into Trainer(trainerId, trainerName, emailID, phone) values(4, 'DAVIS', 't4@i.com','9844499996');
insert into Trainer(trainerId, trainerName, emailID, phone) values(5, 'Elsa', 't5@i.com','9844499499');
insert into Trainer(trainerId, trainerName, emailID, phone) values(6, 'Ferguson', 't6@i.com','9844459999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(7, 'Abraham', 't7@i.com','9844996999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(8, 'Gordon', 't8@i.com','9849955999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(9, 'Hilton', 't9@i.com','9899677999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(10, 'Boyce', 't10@i.com','9877788999');
insert into Trainer(trainerId, trainerName, emailID, phone) values(11, 'Zenith', 't11@i.com','9869977799');
insert into Trainer(trainerId, trainerName, emailID, phone) values(12, 'Abraham', 't12@i.com','null');


/* Inserting into Course_Details */
insert into Course_Details(courseId, courseName) values('GPF', 'Programming Fundamentals');
insert into Course_Details(courseId, courseName) values('GDB', 'Relational Database Management System');
insert into Course_Details(courseId, courseName) values('ODB', 'Oracle 8i');
insert into Course_Details(courseId, courseName) values('OVB', 'Visual Basic');
insert into Course_Details(courseId, courseName) values('JJA', 'Java');
insert into Course_Details(courseId, courseName) values('JAJ', 'Advanced Java');
insert into Course_Details(courseId, courseName) values('DNT', 'Introduction to DotNet Technology');
insert into Course_Details(courseId, courseName) values('DCS', 'Programming in C#');
insert into Course_Details(courseId, courseName) values('DDB', 'SQL Server 2000');
insert into Course_Details(courseId, courseName) values('MDB', 'DB2');
insert into Course_Details(courseId, courseName) values('MCS', 'CICS');

/* Inserting into batch schedule */
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch1', 'GPF', '2007-01-10', '2007-01-20');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch1', 'GDB', '2007-01-21', '2007-01-31');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch1', 'ODB', '2007-02-01', '2007-02-20');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch1', 'OVB', '2007-02-21', '2007-02-28');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch2', 'GPF', '2007-01-10', '2007-01-20');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch2', 'GDB', '2007-01-21', '2007-01-31');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch2', 'DNT', '2007-02-01', '2007-02-01');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch2', 'DCS', '2007-02-02', '2007-02-15');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch2', 'DDB', '2007-02-16', '2007-02-22');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch3', 'GDB', '2007-01-25', '2007-02-02');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch3', 'JJA', '2007-02-03', '2007-02-20');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch3', 'JAJ', '2007-02-21', '2007-02-28');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch4', 'GPF', '2007-02-01', '2007-02-11');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch4', 'GDB', '2007-02-12', '2007-02-23');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch4', 'MDB', '2007-02-23', '2007-02-28');
insert into Batch_Schedule(batchName, courseId, startDate, endDate) values('Batch4', 'MCS', '2008-03-01', '2008-03-15');


/* Inserting into Feedback */
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'GPF','Batch1',4.18);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(11, 'GPF','Batch1',4.65);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(2, 'GDB','Batch1',4.51);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'GDB','Batch1',4.68);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'GPF','Batch2',4.28);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(1, 'GPF','Batch2',4.28);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'ODB','Batch1',4.32);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'OVB','Batch1',4.08);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'MDB','Batch4',4.12);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'MCS','Batch4',4.08);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'JAJ','Batch3',4.12);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'DNT','Batch2',4.12);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'DDB','Batch2',4.12);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'DCS','Batch2',4.08);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(12, 'JJA','Batch3',4.67);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(2, 'GDB','Batch2',4.61);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(2, 'GDB','Batch3',4.41);
insert into Feedback(trainerId, courseId, batchName, FBRate) values(2, 'GDB','Batch4',4.52);
