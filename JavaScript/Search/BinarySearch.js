function busquedaBinaria(array, elemento) {
    let index = 0 // primer elemento del array
    let final = array.length - 1 // último elemento del array a buscar

    // mientras el índice sea menor o igual que el final
    // seguiremos buscando
    while (index <= final) {
        // calculamos la mitad del array
        // como puede ser impar, usamos Math.floor para redondear hacia abajo
        const mitad = Math.floor((index + final) / 2)

        // si el elemento de la mitad es igual al elemento que estamos buscando
        // entonces hemos encontrado el elemento
        if (array[mitad] === elemento) {
            return mitad
        } else if (array[mitad] < elemento) {
            // si el elemento de la mitad es menor que
            // el elemento que estamos buscando
            // entonces tenemos que buscar en la mitad derecha
            index = mitad + 1
        } else {
            // si el elemento de la mitad es mayor que
            // el elemento que estamos buscando
            // entonces tenemos que buscar en la mitad izquierda
            final = mitad - 1
        }
    }

    // si llegamos hasta aquí, es que no hemos encontrado el elemento
    // devolvemos -1, para indicar que no se ha encontrado
    return -1
}

console.log(busquedaBinaria([11, 18, 23, 25, 48, 55, 88, 111, 120], 55));
