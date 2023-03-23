/*
La calculadora debe contar con los siguientes métodos:

add: recibe un número, lo suma al total y devuelve el resultado
subtract: recibe un número, lo resta al total y devuelve el resultado
multiply: recibe un número, lo multiplica al total y devuelve el resultado
divide: recibe un número, lo divide al total y devuelve el resultado
clear: reinicia el total a 0 y devuelve el resultado
getTotal: devuelve el total actual.

 */

function createCalculator() {

    let total = 0;

    return {
        add(num) {
            total += num;
            return total;
        },

        subtract(num) {
            total -= num;
            return total;
        },

        multiply(num) {
            total *= num;
            return total;
        },

        divide(num) {
            total /= num;
            return total;
        },

        clear() {
            total = 0;
            return total;
        },

        getTotal() {
            return total;
        },
    }

}

console.log("***** ADD *****");

const calculator = createCalculator();
console.log(calculator.add(10)); // output 20

console.log("***** ADD & SUBTRACT *****");
const calculator2 = createCalculator();
calculator2.add(10);
console.log(calculator2.subtract(-10)); // output 20

console.log("***** ADD, SUBTRACT AND CLEAR *****");
const calculator3 = createCalculator();
calculator3.add(10);
calculator3.subtract(-10);
console.log(calculator3.clear()); // output = 0

console.log("***** MULTIPLY AND TOTAL *****");
const calc = createCalculator();
calc.add(1);
console.log(calc.multiply(20));
console.log(calc.getTotal());

console.log("***** DIVIDE *****");
calc.clear();
calc.add(10);
console.log(calc.divide(2));
