/*

Requirement: Given a number, draw a triangle using * and blank spaces with the number of rows based on number

Test Cases:
    draw(4);

    output
    *
   ***
  *****
 *******

Steps:
    - create a function that receives a number
    - make a for to draw rows
    - make a for to draw columns with *

*/

function draw(number) {

    let result = "";
    let middle = Math.floor(number - 1);

    for (let row = 0; row < number; row++) {
        let rowContent = "";
        for (let col = 0; col < (2 * number - 1); col++) {

            if (middle - row <= col && middle + row >= col) {
                rowContent += "*";
            } else {
                rowContent += " ";
            }
        }
        result += rowContent + "\n";
    }

    return result;

}

console.log(draw(4));
