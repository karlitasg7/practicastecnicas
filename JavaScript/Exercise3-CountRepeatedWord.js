/*

Requirement: Given a word, searching in a phrase and return how many times its appears in that phrase.
             The word and the phrase must be parameters in a function


Steps:
- create a function that receives a word and a phrase
- create an array with all words in the phrase and convert that words to lower case
    - clean special characters with a regex
- make a for cycle and compare with the word
- if the word its the same sum in a counter
- return the counter

Test Cases:
- search("hola soy una palabra en una frase, PALABRA", "palabra") // returns 2
- search("soy la frase", "victor") // returns 0

*/

function search(phrase, word) {

    let phraseArrayWord = phrase.toLowerCase().replace(/[!.,-]/gi, '').split(' '); //O(1) in space

    let counter = 0; // O(1) space
    for (let phraseWord of phraseArrayWord) { // O(n) in time
        if (phraseWord === word) {
            counter += 1;
        }
    }

    return counter;

}

console.log(search("hola soy una palabra en una frase, PALABRA", "palabra")); // returns 2
console.log(search("soy la frase", "victor")); // returns 0
