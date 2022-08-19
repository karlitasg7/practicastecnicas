/*

Requirement: create a function to receives a number as a parameter and returns its multiplication table

Steps:
- define a function with a number as a parameter
- make a for cycle from 1 to 10 to make the multiplication and print with console log the result, example 1 x 1 = 1

*/

function getTable(number) {
    console.log(`# Tabla del ${number} #`)
    for (let i = 1; i <= 10; i++) {
        console.log(`${i} x ${number} = ${i * number}`);
    }
}

getTable(5);
