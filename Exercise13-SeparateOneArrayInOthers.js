/*

Requirement: Given an array, separate in X arrays, based in a number that indicate the size

Test Cases:
    divideArray([7,8,9,10], 2); // return [7,8], [9,10]

Steps:
    - create a function that receives an array an a number as a parameter
    - create a variable to save the array of arrays (for response)
    - make a while the array has elements
    - inside the while make another while from 0 to the size number (parameter)
    - get the element and push in new array
    - add new array to the principal array (array of arrays)
    - return the array of arrays

*/

function divideArray(arr, size) {
    let arrayOfArrays = [];

    while (arr.length > 0) {
        let i = 0;
        let newArray = [];
        while (i < size) {

            if (arr.length == 0) break;

            newArray.push(arr[0]);
            arr.shift();

            i++;
        }
        arrayOfArrays.push(newArray);
    }

    return arrayOfArrays;

}

// this function is O(n) because only use one for, so this is a better option
function divideArray2(arr, size) {
    let arrayOfArrays = [];

    for (let element of arr) {
        let last = arrayOfArrays[arrayOfArrays.length - 1];

        if (!last || last.length === size) {
            arrayOfArrays.push([element]);
        } else {
            last.push(element);
        }

    }
    return arrayOfArrays;

}

console.log(divideArray2([7, 8, 9, 10], 2)); // return [7,8], [9,10]
console.log(divideArray2([7, 8, 9, 10, 5], 2)); // return [7,8], [9,10], [5]
