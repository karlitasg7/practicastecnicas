const matrix = [
    [1, 2, 3],
    [4, 5, 6, [1, 2, [1, 2]]],
    [7, 8, 9]
];

const matrixFlat = matrix.flat(3);

console.log(matrixFlat);
