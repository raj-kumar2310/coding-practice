# Write your MySQL query statement below

select s.student_id,s.student_name,b.subject_name,ifnull(count(c.subject_name),0) as attended_exams  from Students s
cross join Subjects b 
left join Examinations c on s.student_id =c.student_id and b.subject_name =c.subject_name 
group by s.student_id ,s.student_name,b.subject_name  order by s.student_id,b.subject_name;