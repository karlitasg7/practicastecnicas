/*

Requirement: Given two arrays, return a new one array with the common elements

Test Cases:
    getCommonElements([4,5,6,7], [7,8,9,7,5]); // return [5,7]

Steps:
    - create a function that receives two arrays of numbers
    - use the JS filter to get the elements include from array a into b and return it

*/

function getCommonElements(arr1, arr2) {
    return arr1.filter(x => arr2.includes(x));
}

console.log(getCommonElements([4, 5, 6, 7], [7, 8, 9, 7, 5]));
