var { a, b = 20 } = { a: 10 };
// var { a = 40, b = 20 } = { a: 90 };
console.log(a);
console.log(b);

// var { a: y = 40, b: z = 20 } = { a: 10 };
// console.log(y);
// console.log(z);
