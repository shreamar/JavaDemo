use imcs;

# a. List the names of all the courses handled by each trainer. The output should be <TrainerName> <CourseName>
  
 select distinct Trainer.trainerName, Trainer.trainerId ,courseName 
 from Course_Details
inner join Feedback
	on Course_Details.courseId = Feedback.courseId
inner join Trainer
on Feedback.trainerId = Trainer.trainerId;

        
# b. List the name of trainers who have handled more than one course.  
select distinct Trainer.trainerName, Trainer.trainerId, count(Course_Details.courseName) as 'No of Courses'
from Trainer
inner join Feedback
    on Trainer.trainerId = Feedback.trainerId
inner join Course_Details
    on Feedback.courseId = Course_Details.courseId
group by Trainer.trainerId
having count(Course_Details.courseName) >1;


# c. List the TrainerId, name of trainers and the number of different courses handled.   
select distinct Trainer.trainerName, Trainer.trainerId, count(Course_Details.courseName) as 'No of Courses'
from Trainer
left join Feedback
    on Trainer.trainerId = Feedback.trainerId
left join Course_Details
    on Feedback.courseId = Course_Details.courseId
group by Trainer.trainerId;

# d. List the TrainerId, name of trainers, course names and the number of times each course has been handled.  
select Trainer.trainerId, Trainer.trainerName, Course_Details.courseName, count(Course_Details.courseId) as 'no of times handled'
from Trainer
Left join Feedback
		  Right join Course_Details
					right join Batch_Schedule 
						on Course_Details.courseid = Batch_Schedule.courseId
			on Feedback.courseId = Course_Details.courseId
      on Trainer.trainerId = Feedback.trainerId
      group by Trainer.trainerId, Course_Details.courseId;

# e. Get the complete training duration for each batch.  
select batchName , sum(datediff(endDate, startDate)) as 'training duration'
from Batch_Schedule
group by batchName;

# f. Get the course details and trainer details for each batch as on 20 feb 2007.  


# g. List the id of trainers who have handles more than one course for a batch along with the BatchName.  
select Trainer.trainerId,Trainer.trainerName,Batch_Schedule.batchName,  count(distinct Batch_Schedule.courseId) as 'course handled for batch'
from Trainer
	inner join Feedback
				inner join Batch_Schedule
					on Feedback.batchName = Batch_Schedule.batchName
		on Trainer.trainerId = Feedback.trainerId
group by Trainer.trainerId, Batch_Schedule.batchName;
        

# h. List the trainers (if any) who have handles all the courses present in the course table.  
select distinct Trainer.trainerName, Trainer.trainerId, count(distinct Course_Details.courseId) as 'No of Courses'
from Trainer
inner join Feedback
    on Trainer.trainerId = Feedback.trainerId
inner join Course_Details
    on Feedback.courseId = Course_Details.courseId
group by Trainer.trainerId
having count(distinct Course_Details.courseId) = (select count(Course_Details.courseId) from Course_Details);
