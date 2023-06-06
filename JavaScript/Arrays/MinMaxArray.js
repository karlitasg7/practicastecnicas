function minAndMaxWord(words) {
    const max = Math.max(...words);
    const min = Math.min(...words);

    return [words.indexOf(min), words.indexOf(max)];

}

console.log(minAndMaxWord([999, 255, 121]));
console.log(minAndMaxWord([2, 1, 3, 4, 5, 6, 7, 8, 9]));
console.log(minAndMaxWord([5, 10, 15, 20]));
