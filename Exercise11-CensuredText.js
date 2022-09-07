/*

Requirement: Given a text and a text search, censure all the text search in the text with [-CENSURED-]
             If the text and text search doesn't exists it must be return "Can't read the text and the searcher"
             If the text doesn't exists return "Can't read the text"
             If the search doesn't exists return "Can't read the search"

Test Cases:
    censure("hola hola", "hola"); // returns [-CENSURED-] [-CENSURED-]
    censure(); // return Can't read the text and the searcher
    censure(,"hola"); // return Can't read the text
    censure("hola"); // return Can't read the search

Steps:
    - create a function that receives a text and a text search
    - validate if text or text searcher doesn't exists, if not return the message
    - use replace all function to change all text search by [-CENSURED-]
    - return the new text

*/

function censure(text = false, textSearch = false) {

    if (!text && !textSearch) {
        return "Can't read the text and the searcher";
    } else if (!text) {
        return "Can't read the text";
    } else if (!textSearch) {
        return "Can't read the search";
    }

    // return text.replace(new RegExp(textSearch, "gi"), "[-CENSURED-]"); // solution using regular expresion
    return text.replaceAll(textSearch, "[-CENSURED-]"); // solution using replaceAll
}

console.log(censure("hola hola", "hola")); // returns [-CENSURED-] [-CENSURED-]
console.log(censure()); // return Can't read the text and the searcher
console.log(censure(false, "hola")); // return Can't read the text
console.log(censure("hola")); // return Can't read the search
