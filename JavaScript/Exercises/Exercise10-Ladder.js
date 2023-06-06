/*

Requirement: Given a number, return a ladder of "[-]" using the number to the levels

Test Cases:
    stairs(4); // returns
                [-]
                [-][-]
                [-][-][-]
                [-][-][-][-]

Steps:
    - create a function that receives a parameter number
    - create a variable to save the resulta
    - make a for cycle from 0 to number
    - add other for cycle from 0 to variable in the first cycle
    - concatenate the symbols to the variable
    - print the variable

*/

function stairs(number) {
    let stairs = "";
    for (let i = 1; i <= number; i++) {
        for (let col = 0; col < i; col++) {
            stairs += "[-]";
        }
        stairs += "\n";
    }
    console.log(stairs);
}

stairs(4);
