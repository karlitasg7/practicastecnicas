function buscaPalabras(words, word) {
    const index = words.indexOf(word);

    return words.filter(w => w.length > index);
}

console.log(buscaPalabras(["hola", "dos", "tres", "b"], "b"));
