const numbers = [1, 2, 3, 4, 5, 6];

// imperative
function sumNumbers(collection) {
    let sum = 0;

    for (let item of collection) {
        sum += item;
    }
    return sum;
}

// declarative
function sumNumbers2(collection) {
    return collection.reduce((sum, item) => sum + item, 0);
}

console.log(sumNumbers(numbers));
console.log(sumNumbers2(numbers));
