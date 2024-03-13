const n = [12, 34, 5, 43, 6];
console.log(n);
let sum = (a, b) => {
  return a + b;
};
let ans = n.reduce(sum);
console.log(ans);
