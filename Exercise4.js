/*

Requirement: Given a text invert the characters order, without using the language methods, only use control structures

Test cases:
    invert('hola'); // return 'aloh'
    invert('karla'); // return 'alrak'

Steps:
    - create a function that receives a word as a parameter
    - create a variable to save the new word
    - make a for cycle to get each character from the end to the begin and add each character to the new variable
    - return the new variable 

*/

function invert(word) {
    let newWord = '';

    // in this solution, it use a counter from the end to the begin
    // for (let i = word.length - 1; i > -1; i--) {
    //     newWord += word[i];
    // }

    // other solution
    for (let letter of word) {
        newWord = letter + newWord;
    }

    return newWord;

}

console.log(invert('hola')); // return 'aloh'
console.log(invert('karla')); // return 'alrak'
console.log(invert('victor')); // return 'rotciv'
