/*

Requirement: Given an integer array, validate if the list it's a permutation of the number passed as parameter
            In this case a permutation is a sequence of numbers in order without missing any of them

Test Cases:
    permutation([1,2,3,4,5], 5); // returns true
    permutation([1,2,3,5], 5); // returns false

Steps:
    - create a function that receives an int array and a number    
    - make a for cycle from 1 to number
    - valid if the array contains the counter
    - if not contains return false
    - if contains continue, and finally return true

*/

function permutation(arr, num) {
    for (let i = 1; i <= num; i++) {
        if (!arr.includes(i)) {
            return false;
        }
    }
    return true;
}

console.log(permutation([1, 2, 3, 4, 5], 5)); // returns true
console.log(permutation([1, 2, 3, 5], 5)); // returns false
