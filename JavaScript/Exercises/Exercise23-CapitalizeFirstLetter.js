/*

Requirement: Given a text, put the first letter of each word in upper and the return the new text

Test Cases:
    convert('hello how are you'); // return 'Hello How Are You'

Steps:
    - create a function that receives a text
    - separate the text by blank space to create an array
    - make a for cycle and get a substring with the first letter, convert that letter to upper and the rest in lower case
    - replace the current value
    - join all the array again to create a new text
    - return the text

*/

function convert(text) {

    if (text === "") {
        return text;
    }

    let wordsList = text.split(" ");

    for (let i = 0; i < wordsList.length; i++) {
        wordsList[i] = wordsList[i].substring(0, 1).toUpperCase() + wordsList[i].substring(1);
    }

    return wordsList.join(' ');

}

console.log(convert('hello how are you'));
console.log(convert('a'));
