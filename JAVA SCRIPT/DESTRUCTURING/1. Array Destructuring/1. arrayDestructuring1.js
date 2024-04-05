var a = ["JavaScript", "SixMonths", "GeekyShows"];
/* // Old Way
      var courseName = a[0];
      var duration = a[1];
      var tutor = a[2];
      */
// Array Destructuring
var [courseName, duration, tutor] = a;
console.log(courseName);
console.log(duration);
console.log(tutor);
