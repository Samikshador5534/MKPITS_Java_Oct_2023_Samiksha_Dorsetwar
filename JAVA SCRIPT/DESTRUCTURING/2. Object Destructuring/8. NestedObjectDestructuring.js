var course = {
  courseName: "JavaScript",
  duration: "SixMonths",
  tutor: "Technocrats Solutions",
  student: {
    stu1: "Rahul",
    stu2: "Sonam",
  },
};
var {
  courseName,
  duration,
  tutor,
  student: { stu1, stu2 },
} = course;
console.log(courseName);
console.log(duration);
console.log(tutor);
console.log(stu1);
console.log(stu2);
