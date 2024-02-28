console.log(3 - 2);
console.log("4" - 3); // string is converted to number before subtraction, so the result will be "1"
console.log(true - 0); // true is converted to 1 and false is converted to 0, so the result will be  1 - 0 = 1
console.log(false - 1);

console.log(3 - "hello"); //
// JavaScript tries to convert "hello" (a string) into a number and fails because it's not a valid numerical value,
// resulting in NaN  because JavaScript cannot perform arithmetic operations between a number NaN

console.log(-3 - 2);
