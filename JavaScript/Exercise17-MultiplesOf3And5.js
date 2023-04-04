/*

Requirement:
    Given a number, show all the numbers from 1 to the number (parameter)
    but if the number it's multiple of 3 show "buzz"
    if the number its multiple of 5 show "lightyear"
    if the number is multiple of 3 and 5 show "Buzzlightyear"

Test Cases:
    buzz(5); // returns
                1
                2
                buzz
                4
                lightyear

Steps:
    - create a function that receives a number as a parameter
    - make a for cycle from 1 to number
    - valid the cases and show the message or show the number

    --- refactor: add a function to validate if a number is a multiple of other, this help to reuse the code and make it more readable

*/

function isMultipleOf(number, multiple) {
    return (number % multiple) === 0
}

function buzz(number) {
    console.log(`*****Multiples Of ${number}*****`);

    for (let i = 1; i <= number; i++) {
        if (isMultipleOf(i, 5) && isMultipleOf(i, 3)) {
            console.log("Buzzlightyear");
        } else if (isMultipleOf(i, 3)) {
            console.log("buzz");
        } else if (isMultipleOf(i, 5)) {
            console.log("lightyear");
        } else {
            console.log(i);
        }
    }

}

buzz(5);
buzz(15);
