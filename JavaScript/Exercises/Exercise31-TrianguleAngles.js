/*

Requirement: Given a number, show the angle type

Test Cases:
    angle(47); // agudo
    angle(90); // recto
    angle(145); // obtuso
    angle(180); // llano

Steps:
    - create a function that receives a number
    - validate the number
    - return the type

*/

function angle(number) {
    let result = "Completo";

    if (number < 90) {
        result = "agudo";
    } else if (number === 90) {
        result = "recto";
    } else if (number > 90 && number < 180) {
        result = "obtuso";
    } else if (number === 180) {
        result = "llano";
    } else if (number > 180 && number < 360) {
        result = "concavo";
    }

    return result;

}

console.log(angle(47)); // agudo
console.log(angle(90)); // recto
console.log(angle(145)); // obtuso
console.log(angle(180)); // llano
