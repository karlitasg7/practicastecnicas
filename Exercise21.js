/*

Requirement: Given a string and a number, extract the first X (number) characters in the string

Test Cases:
    extract('Course web', 6); // return 'Course'

Steps:
    - create a function that receives a string and a number as a parameter
    - extract using substring

*/

function extract(text, number) {
    return text.substring(0, number);
}

console.log(extract('Course web', 6)); // return 'Course'
