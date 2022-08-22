/*

Requirements: Draw a square with asterisks, but with blank spaces inside

Test Cases:
    draw_square(4) its should return:
        ****
        *  *
        *  *
        ****

Steps:
    - create a function that receives a parameter with the number of asterisks
    - add cycle for, from 0 to parameter number, this is for rows
    - add other cycle for inside from 0 to parameter number, this is for columns
        - if it's the first and last line draw all the asterisks (valid with the first cycle, rows)
        - if not only draw the first and last asterisk, otherwise draw blank space (valid this in the second cycle)

*/

function draw_square(number) {

    let draw = '';
    let indexLastRow = number - 1

    for (let i = 0; i < number; i++) {
        for (let j = 0; j < number; j++) {
            if (i == 0 || i === indexLastRow || j === 0 || j === indexLastRow) {
                draw += "*";
            } else {
                draw += " ";
            }
        }
        draw += "\n";
    }

    console.log(draw);

}

draw_square(4);