let a = 2;
let b = "2";
let c = true;
let d = null;
let e = undefined;

console.log(a === b);
console.log(a === c);
console.log(d === e);
// Number vs String Comparison - False

// Type Coercion
console.log("5" == 5); // True, because JavaScript does automatic type conversion called type coercion
// It converts the string to number and compares them

console.log("5" != 5); // False
