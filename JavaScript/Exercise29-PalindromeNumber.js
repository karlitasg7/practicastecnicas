/*

Requirement: Given a number check if it is palindromic

Test Cases:
    isPalindrome(2002); // true
    isPalindrome(2014); // false

Steps:
    - create a function that receives a number as a parameter
    - convert to string
    - convert number to array of numbers
    - invert order
    - concat and convert to int

*/

function isPalindrome(number) {

    let numberReversed = parseInt(number
        .toString()
        .split('')
        .reverse()
        .join(''));

    return number === numberReversed;
}

console.log(isPalindrome(2002));
console.log(isPalindrome(2014));
