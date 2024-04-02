let age = prompt("Enter your age:");
if (age >= 18) {
  alert("YES! You can drive.");
} else if (age < 0) {
  alert("Age entered is  negative.");
} else {
  alert("You cannot drive.");
}
console.error("This is an error message");
let x = confirm("Press OK if yes, Cancel for no.");
if (x) {
  console.log("OK pressed");
} else {
  console.log("Cancel pressed");
}
