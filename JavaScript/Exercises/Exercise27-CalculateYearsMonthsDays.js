/*

Requirement: Given a number calculate how many years, months and days are
             
Test Cases:
    calculateDays(920); // 2 years, 6 months and 10 days

Steps:
    - create a function that receives a number as a parameter
    - make division to get each data

*/

function calculateDays(number) {

    let years = Math.floor(number / 365);
    let days = number % 365;
    let months = Math.floor(days / 30);
    days = days % 30;

    return `${years} years, ${months} months and ${days} days`;

}

console.log(calculateDays(920));
console.log(calculateDays(5000));
