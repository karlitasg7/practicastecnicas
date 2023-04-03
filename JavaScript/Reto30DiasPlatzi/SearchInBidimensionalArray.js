/*
En este desafío, tu objetivo es encontrar un valor específico en un array de dos dimensiones.

La función searchValue recibirá dos parámetros: un array bidimensional y un valor a buscar.
Tu tarea será implementar la lógica necesaria para encontrar el valor y retornar un objeto con las propiedades
row y column que indicarán la posición del valor dentro del array bidimensional.

Si el valor no se encuentra en la matriz, la función deberá lanzar un error con el mensaje "Valor no encontrado".
 */

function searchValue(array, value) {

    if (!array.flat().includes(value))
        throw new Error("Valor no encontrado");

    for (let r = 0; r < array.length; r++) {

        if (array[r].includes(value)) {
            return {
                row: r,
                column: (array[r].indexOf(value))
            }
        }
    }
}

console.log(
    searchValue([
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9],
        ],
        5
    )
); //Output: {row: 1, column: 1,}

console.log(
    searchValue([
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9],
        ],
        45
    )
); // Output: "Valor no encontrado"
