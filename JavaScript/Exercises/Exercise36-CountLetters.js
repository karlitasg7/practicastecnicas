/*

Requirement: Given a text, count how many vowels and consonants it has

Test Cases:
    countLetters("hello");

    output:
        vowels: 2
        consonants: 3

Steps:
    - create a function that receives a text
    - clean text to delete numbers, symbols or any character that isn't a letter
    - make a for with each letter
    - check with regular expressions

*/

function countLetters(text) {

    let consonants = 0;
    let vowels = 0;

    let newText = text
        .split("")
        .filter(letter => /[\w]/gi.test(letter) && isNaN(letter))
        .join("");

    for (let letter of newText) {
        if (/[aeiou]/gi.test(letter)) {
            vowels++;
        } else {
            consonants++;
        }
    }

    return [`Consonants: ${consonants}, Vowels: ${vowels}`];

}

console.log(countLetters("hello"));
console.log(countLetters("hello!!!123"));
