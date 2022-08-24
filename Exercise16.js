/*

Requirement: Given a text, returns how many vocals are there

Test Cases:
    vowels("hello"); // return 2

steps:
    - create a function that receives a text
    - create a variable to save the counter
    - make a for cycle for each letter in the phrase
    - valid if the letter is a vowel, create a regex to validate it
    - if the letter is a vowel increase the counter
    - return the counter

*/

function vowels(text) {

    let counter = 0;
    let re = new RegExp("[aeiou]");

    for (let letter of text) {
        if (re.test(letter)) {
            counter += 1;
        }
    }

    return counter;
}

console.log(vowels("hello")); // return 2
console.log(vowels("this is another test")); // return 6