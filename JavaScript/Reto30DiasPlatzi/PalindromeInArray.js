/*
En este desafío, debes crear una función que encuentre el palíndromo más largo en una lista de palabras.

Recibirás un único parámetro: un array de palabras.
Si no hay ningún palíndromo en la lista, la función debe devolver null.
Si hay más de un palíndromo con la misma longitud máxima, debes devolver el primer palíndromo encontrado en la lista.

Un palíndromo es una palabra que se puede leer de la misma manera tanto hacia adelante como hacia atrás.
 */

function findLargestPalindrome(words) {

    let maxLen = 0;
    let lastMaxWord = null;

    const palindromeArray = words.filter(word => word === word.split("").reverse().join(''));

    palindromeArray.forEach(x => {
        if (x.length > maxLen) {
            maxLen = x.length;
            lastMaxWord = x;
        }
    })

    return lastMaxWord;

}


console.log(findLargestPalindrome(["racecar", "level", "world", "hello"]));
// Output: "racecar"

console.log(findLargestPalindrome(["Platzi", "javascript", "html", "css"]));
// Output: null
