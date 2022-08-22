/*

Requirements: Given a integer number, invert it and return it

Test Cases:
    invertNumber(67); // return 76

Steps:
    - create a function that receives one parameter (int)
    - convert the number to string, then split as an array, invert and join again
    - convert the result as int
    - return the new number

*/

function invertNumber(number) {
    return parseInt(number.toString().split('').reverse().join('')) * Math.sign(number);
}

console.log(invertNumber(67));
console.log(invertNumber(-125));
