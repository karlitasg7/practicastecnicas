/*

Requirements: Make a function that respond the question: What is the X percentage of X number?

Test Cases:
    - getPercentage(20, 100); // return 20
    - getPercentage(43, 897); // return 385.71

Steps:
    - create a function that receives two parameters
        - param1 = percentage
        - param2 = number
    - use the formula = number * (percentage / 100)
    - return the result    

*/


function getPercentage(percentage, number) {
    return `The ${percentage}% of ${number} is ${number * (percentage / 100)}`;
}

console.log(getPercentage(20, 100)); // return 20
console.log(getPercentage(43, 897)); // return 385.71