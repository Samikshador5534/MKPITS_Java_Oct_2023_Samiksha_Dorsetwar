let age = prompt("Enter your age:");
document.body.style.backgroundColor = "white";
if (age >= 18) {
  document.body.style.backgroundColor = "green"; // Green for allowed to drive
} else if (age < 0) {
  alert("Age entered is negative.");
  document.body.style.backgroundColor = "red"; // Red for invalid age
} else {
  alert("You cannot drive.");
  document.body.style.backgroundColor = "yellow"; // Yellow for not allowed
}
console.error("This is an error message");
let x = confirm("Press OK if yes, Cancel for no.");
if (x) {
  console.log("OK pressed");
} else {
  console.log("Cancel pressed");
}
