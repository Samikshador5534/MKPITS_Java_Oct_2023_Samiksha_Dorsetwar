use School;
Create table Student(St_Id Int NOT NULL, St_Name char(10) NOT NULL, St_Tel char(10)  NOT NULL, St_Age int NOT NULL, St_City varchar(20) NOT NULL, St_Marks int NOT NULL, St_ClassId int, St_Address char(20),
 Primary Key(St_Id), foreign Key (St_ClassId) references Classroom(Class_Id) );