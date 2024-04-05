var arr = [10, 20, 30];
/* Old Way
      function show(a) {
        console.log(a[0]);
        console.log(a[1]);
        console.log(a[2]);
      }
      */
// Array Destructuring
function show([value1, value2, value3]) {
  console.log(value1);
  console.log(value2);
  console.log(value3);
}
show(arr);
