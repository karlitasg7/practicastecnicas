/*

Requirement: Given a number show all its divisors

Test Cases:
    showDivisors(5); // return 1, 5

Steps:
    - create a function that receives a number as a parameter
    - make a for cycle, from 1 to number
    - valid if each number is divisor of the parameter
    - if its show, if not continue

*/

function showDivisors(number) {
    for (let i = 1; i <= number; i++) {
        if ((number % i) === 0) {
            console.log(i);
        }
    }
}

showDivisors(5);