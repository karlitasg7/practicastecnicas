/*

Requirements: Given a string and a number, repeat the string many times as the number says

Test Case:
    repeatMe("text", 2); // return texttext

Steps:
    - create a function that receives two parameters, one = string, second = number of times to repeat
    - create a variable to new string
    - make a for cycle from 0 to number
    - concatenate to new string the text
    - return the new string

*/

function repeatMe(text, number) {
    let newString = "";

    for (let i = 0; i < number; i++) { // O(n)
        newString += text;
    }

    return newString;
}

// using prototype
String.prototype.repeat = function repeatMe(number) {
    let newString = "";

    for (let i = 0; i < number; i++) {
        newString += this;
    }

    return newString;
}

console.log(repeatMe("text", 2));
console.log("text".repeat(2));
