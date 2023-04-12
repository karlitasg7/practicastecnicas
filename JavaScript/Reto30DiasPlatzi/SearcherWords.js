/*
Tu reto es retornar un array solo con las palabras que cumplan con la condición de tener un término de búsqueda dado.

Para solucionarlo vas a encontrar una función llamada filterByTerm que recibe los siguientes parámetros de entrada:

array: Un array de strigs con palabras
term: Un string con el término a buscar

Input:
array: ["ana", "santi", "nico", "anastasia"]
term: "ana"

Ouput:
["ana", "anastasia"]

Input:
array: ["ana", "santi", "nico", "anastasia"]
term: "xyz"

Output:
[]

 */

function filterByTerm(array, term) {
    return array.filter(x => x.includes(term));
}

console.log(filterByTerm(["ana", "santi", "nico", "anastasia"], "ana"));
console.log(filterByTerm(["ana", "santi", "nico", "anastasia"], "xyz"));
