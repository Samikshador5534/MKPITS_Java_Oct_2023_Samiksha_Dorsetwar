var arr = [10, 20, 30];
function show(z) {
  return z;
}
/* Old Way
      var x = show(arr);
      console.log(x[0]);
      console.log(x[1]);
      console.log(x[2]);
      */

// var x = show(arr);
// var [value1, value2, value3] = x;
var [value1, value2, value3] = show(arr);
console.log(value1);
console.log(value2);
console.log(value3);
