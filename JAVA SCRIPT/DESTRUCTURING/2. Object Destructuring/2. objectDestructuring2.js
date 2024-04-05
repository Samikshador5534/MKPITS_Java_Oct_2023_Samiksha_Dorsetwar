var course = {
  courseName: "JavaScript",
  duration: "SixMonths",
  tutor: "Technocrats Solutions",
};
// Object Destructuring
var { courseName: cname, duration: time, tutor: teacher } = course;
console.log(cname);
console.log(time);
console.log(teacher);
