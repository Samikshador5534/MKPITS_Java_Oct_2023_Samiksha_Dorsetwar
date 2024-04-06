var course = {
  courseName: "JavaScript",
  duration: "SixMonths",
  tutor: "Technocrats Solutions",
};
function show(z) {
  return z;
}
/* Old Way
      var x = show(course);
      console.log(x.courseName);
      console.log(x.duration);
      console.log(x.tutor);
      */

// Destructuring
// var x = show(course);
// var { courseName, duration, tutor } = x;
var { courseName, duration, tutor } = show(course);
console.log(courseName);
console.log(duration);
console.log(tutor);
