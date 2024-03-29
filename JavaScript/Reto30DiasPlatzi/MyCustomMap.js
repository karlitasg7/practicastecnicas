/*
En este desafío debes desarrollar una implementación personalizada del método map utilizando funciones de orden superior.

Recibirás como parámetros un array y una función (func).
El array contendrá un conjunto de elementos (números, objetos, strings, etc.)
y la función se utilizará para aplicar una acción sobre cada elemento del array.
Tu objetivo es devolver un nuevo array con los resultados de la función tal y como lo haría el método map.
 */

function myMap(array, func) {

    let newArray = [];

    array.forEach(x => {
        newArray.push(
            func(x)
        );
    });

    return newArray;
}

console.log(myMap([1, 2, 3, 4], (num) => num * 2)); // Output: [2,4,6,8]

console.log(
    myMap([
            {name: "michi", age: 2},
            {name: "firulais", age: 6}
        ],
        (pet) => pet.name)
); // Output: ["michi", "firulais"]
