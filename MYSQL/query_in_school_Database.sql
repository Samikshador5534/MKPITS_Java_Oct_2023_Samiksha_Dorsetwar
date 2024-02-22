select * from student;

select * from student where  st_classId = 1;
select * from student where  st_classId = 1 or St_ClassId = 2;

select * from student where st_city !="pune";
select * from student where St_address like "aundh%";

select * from student order by st_name desc;

 select * from student where St_marks >=85;
  select * from student where St_marks <=85;
   select * from student where St_marks =85 or St_Marks =75;