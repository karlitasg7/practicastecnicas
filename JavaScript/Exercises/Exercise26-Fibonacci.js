/*

Requirement: Given a number show it fibonacci serie
             Fibonacci series is an order of numbers and each number is the sum of two previous

Test Cases:
    fib(10) 0,1,1,2,3,5,8,13,21,34,55

Steps:
    - create a function that receive a number
    - create an array with the first two numbers of the series
    - make a for from 2 to number
    - sum de las two numbers and add to the array
    - return the result

*/

function fib(number) {

    let arry = [0, 1];

    for (let i = 2; i <= number; i++) {
        arry.push(arry[i - 2] + arry[i - 1]);
    }

    console.log(arry.join(','));

}


fib(10);
