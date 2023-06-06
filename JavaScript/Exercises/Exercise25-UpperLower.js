/*

Requirement: Given a string change it to lower or upper case
             if there are more characters in upper case the result must be all in upper case
             if there are more characters in lower case the result must be all in lower case

Test Cases:
    convert('JOAQuin'); // return JOAQUIN
    convert('Victor'); // return victor

Steps:
    - create a function that receives a text
    - create a counter variable for how many upper characters are and how many lower characters
    - make a for cycle and count
    - valid wich one is major and convert the string

*/

function convert(text) {

    let countUpper = 0;
    let countLower = 0;

    for (let letter of text) {
        if (/[A-Z]/.test(letter)) {
            countUpper++;
        } else {
            countLower++;
        }
    }

    if (countUpper > countLower) {
        return text.toUpperCase();
    } else {
        return text.toLowerCase();
    }

}

console.log(convert('JOAQuin')); // return JOAQUIN
console.log(convert('Victor')); // return victor
