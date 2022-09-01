/*

Requirement: Given two strings, make an algorithm to check if the strings are anagrams.
             A string is an anagram of other if use the same characters in the same quantity.
             You need to exclude spaces, symbols, points

Test Cases:
    isAnagram("Riesgo", "Sergio"); // return true
    isAnagram("Victor", "Robles"); // return false

Steps:
    - create a function that receives two strings
    - clean each text and order alphabetically
    - compare if the two string are equals

*/

function cleanText(text) {
    // ^ = negacion
    return text
        .replace(/[^\w]/gi, '')
        .toLowerCase()
        .split('')
        .sort()
        .join('')
        ;
}

function isAnagram(text1, text2) {
    return cleanText(text1) === cleanText(text2);
}

console.log(isAnagram("Riesgo", "Sergio")); // return true
console.log(isAnagram("Victor", "Robles")); // return false
