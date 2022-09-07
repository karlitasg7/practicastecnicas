/*

Requirement: Given a text, returns how many vocals are there

Test Cases:
    vowels("hello"); // return 2

steps:
    - create a function that receives a text
    - with a regular expresion get the match of the vowels
    - return the length of the array

*/

function vowels(text) {
    let arry = text.match(/[aeiou]/gi);
    return arry ? arry.length : 0;
}

console.log(vowels("hello")); // return 2
console.log(vowels("this is another test")); // return 6
console.log(vowels("nn")); // return 0