/*

Requirement: Given two numbers show what is the major and what is the minor

Test Cases:
    majorMinor(8, 6); // returns
                      // major number is 8
                      // minor number is 6

Steps:
    - create a function that receives twos numbers
    - valid if number 1 is major show that is the major and the other the minor
    - if not show the other way around

*/

function majorMinor(number1, number2) {
    if (number1 > number2) {
        console.log(`major number id ${number1}`);
        console.log(`minor number id ${number2}`);
    } else {
        console.log(`major number id ${number2}`);
        console.log(`minor number id ${number1}`);
    }
}

majorMinor(8, 6);
