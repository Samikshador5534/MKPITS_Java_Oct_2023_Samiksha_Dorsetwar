let myarr = [23, 45, 67, 45, 2];
let number = myarr.filter(divisible_ten);
function divisible_ten(value) {
  if (value % 10 === 0) {
    return true;
  } else {
    return false;
  }
}
console.log(number);

// const filternum = myarr.filter((myarr) => myarr % 10 === 0);
// console.log(filternum);
