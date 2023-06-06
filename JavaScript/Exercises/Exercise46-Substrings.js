/*

Requirement: Given a string, returns all the possible substrings

Test Cases:
    getSubstrings("hola");

    output:
    [
        'h', 'o', 'l', 'a',
        'ho', 'ol', 'la', 'hol',
        'ola', 'hola'
    ]

*/

function getSubstrings(text) {
    let substrings = [];

    for (let letter in text) {
        let start = parseInt(letter);
        for (let i = 0; i <= text.length - start; i++) {

            let end = start + i;

            substrings.push(text.substring(start, end));
        }

    }

    return substrings.filter(element => element.length >= 1);
}

console.log(getSubstrings("hola"));
