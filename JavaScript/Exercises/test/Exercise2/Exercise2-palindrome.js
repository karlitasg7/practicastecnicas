/*

Requirement: Given a text, verify if its a palindrome

Steps:
- create a function that receives a text as a parameter
- create a new word with reverse the string (as an array) and compare with the original word

Test cases:
- isPalindrome("otto") // true
- isPalindrome("victor") // false

*/

function isPalindrome(text) {
    return text === text.split("").reverse().join('')
}

module.exports = isPalindrome;
