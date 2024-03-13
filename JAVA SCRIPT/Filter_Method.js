const words = [
  "spray",
  "elite",
  " execution",
  "exuberant",
  "destruction",
  "present",
];

const result = words.filter((word) => word.length > 6);

console.log(result);
// Expected output: Array ["exuberant", "destruction", "present"]

const n = [12, 34, 5, 43, 6, "55", null];
console.log(n.filter((value) => typeof value === "number")); // Output : [12, 34, 5, 43]
