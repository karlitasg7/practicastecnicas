/*

Requirement: Given an array of numbers, return the array with each number to square
             If receive non-numeric value, it must be deleted

Test Cases:
    toSquare([5,6,7]); // [25,36,49]
    toSquare([5,6,7, "ks"]); // [25,36,49]

Steps:
    - create a function that receives an array of numbers
    - filter the array
    - change each number to square
    - return the result

*/

function toSquare(arr) {
    return arr
        .filter(number => typeof number === "number")
        .map(number => number * number);
}

console.log(toSquare([5, 6, 7])); // [25,36,49]
console.log(toSquare([5, 6, 7, "ks"])); // [25,36,49]
