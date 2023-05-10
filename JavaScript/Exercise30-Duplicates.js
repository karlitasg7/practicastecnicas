/*

Requirement: Given an array of numbers, return the array without duplicated elements
             if there is a string, delete from the array

Test Cases:
    deleteDuplicates([1,2,1,1,1,3,4]); // [1,2,3,4]

Steps:
    - create a function that receives an array of numbers
    - make a for and delete strings
    - use set to delete duplicated

*/

function deleteDuplicates(array) {
    return Array.from(
        new Set(
            array.filter(x => {
                return typeof x === "number";
            })
        )
    );
}

console.log(deleteDuplicates([1, 2, 1, 1, 1, 3, 4])); // [1,2,3,4]
console.log(deleteDuplicates([1, 2, "hi", 1, 1, 3, 4])); // [1,2,3,4]
