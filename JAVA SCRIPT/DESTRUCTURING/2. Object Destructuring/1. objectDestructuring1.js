var course = {
  courseName: "JavaScript",
  duration: "SixMonths",
  tutor: "Technocrats Solutions",
};
/* Old Way
      console.log(course.courseName);
      console.log(course.duration);
      console.log(course.tutor); 
      */

// Object Destructuring
var { courseName, duration, tutor } = course;
console.log(courseName);
console.log(duration);
console.log(tutor);
