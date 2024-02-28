console.log("3" > 2);
console.log("2" > 3);
console.log(true > false);

console.log(2n > 2);
console.log(5n > 4);
console.log(undefined > null);
console.log(null > undefined);
// The comparison operator returns true if the left operand is greater than or equal to the right operand, and false otherwise.

// Comparisons with non-numbers will result in NaN comparison, which is always false:
let str = "10";
console.log(str > 9); // true
console.log(str < 10); // false
