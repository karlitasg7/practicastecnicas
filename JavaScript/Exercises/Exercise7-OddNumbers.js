/*

Requirements: Given two numbers return how many odd numbers there are between both

Test Cases:
    quantityOdd(1, 100); //return 50

Step:
    - create a function that receives two numbers
    - create a counter variable
    - make a for using as initial number 1 and end number 2
    - valid if the number is odd, add to a counter
    - return counter    

*/

function quantityOdd(number1, number2) {
    let counter = 0;
    for (let i = number1; i < number2; i++) {
        if ((i % 2) != 0) {
            counter += 1;
        }
    }
    return counter;
}

console.log(quantityOdd(1, 100));
