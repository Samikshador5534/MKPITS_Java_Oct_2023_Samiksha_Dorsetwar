var course = {
  courseName: "JavaScript",
  duration: "SixMonths",
  tutor: "Technocrats Solutions",
};
/* Old Way
      function show(a) {
        console.log(a.courseName);
        console.log(a.duration);
        console.log(a.tutor);
      }
      */
// Object Destructuring, It is not necessary to write all keys
function show({ courseName, duration, tutor }) {
  console.log(courseName);
  console.log(duration);
  console.log(tutor);
}
show(course);
