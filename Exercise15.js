/*

Requirement: Given a text, return the most used character

Text Cases:
    mostUsed("thisisatestcase"); // returns s

Steps:
    - create a function that receives a text
    - create a map with the different letters of the text, if exists increase the counter, if not add and put the counter in 1
    - go over the map and valid with the last character, valid if the counter is greather or no
    - return the last char is greather

*/

// using a map
function mostUsed(text) {
    let map = new Map();

    for (let letter of text) {
        if (map.get(letter)) {
            map.set(letter, (map.get(letter) + 1));
        } else {
            map.set(letter, 1);
        }
    }

    let lastCharMostUsed = '';
    let lastCharCounter = 0;
    map.forEach((value, key) => {
        if (value > lastCharCounter) {
            lastCharCounter = value;
            lastCharMostUsed = key;
        }
    });

    return lastCharMostUsed;

}

// using json object
function mostUsedJSon(text) {

    let map = {};

    for (let letter of text) {
        if (!map[letter]) {
            map[letter] = 1;
        } else {
            map[letter]++;
        }
    }

    let lastCharMostUsed = '';
    let lastCharCounter = 0;

    for (let letter in map) {
        if (map[letter] > lastCharCounter) {
            lastCharCounter = map[letter];
            lastCharMostUsed = letter;
        }
    }

    return lastCharMostUsed;

}

console.log(mostUsed("thisisatestcase"));
console.log(mostUsedJSon("thisisatestcase"));