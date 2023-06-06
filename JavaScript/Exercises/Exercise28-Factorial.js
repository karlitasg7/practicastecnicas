/*

Requirement: Given a number return the factorial.
The factorial is the multiplication of all numbers until the given number.

Test Cases:
    factorial(5); // 120 (1 x 2 x 3 x 4 x 5)

Steps:
    - create a function that receives a number as a parameter
    - make a bucle from 1 to number
    - multiply previous number with actual
    - return result

*/

function factorial(number) {

    let result = 1;

    for (let i = 1; i <= number; i++) {
        result *= i;
    }

    return result;

}

console.log(factorial(5));
