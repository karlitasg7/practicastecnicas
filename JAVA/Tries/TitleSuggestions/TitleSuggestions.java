package Tries.TitleSuggestions;

import Tries.Trie;

/*

    Given an array of book titles, an array with prefix of search, returns an array if the prefix are from the titles


  Example 1:
   Input:
     books: ["Whatever", "Book 1", "water", "Book 35"]
     prefixes: ["Wo", "Wa", "Boo", "fr"]
     ignoreCase: false

   Output:
     [false, false, true, false]

  Example 2:
   Input:
     books: ["Whatever", "Book 1", "water", "Book 35"]
     prefixes: ["Wo", "Wa", "Boo", "fr"]
     ignoreCase: true

   Output:
     [false, true, true, false]
 */
public class TitleSuggestions {

    public boolean[] titleSuggestions(String[] books, String[] prefixes, boolean ignoreCase) {
        Trie dictionary = new Trie(ignoreCase);

        for (String book : books) {
            dictionary.insert(book);
        }

        boolean[] result = new boolean[prefixes.length];
        for (int i = 0; i < prefixes.length; i++) {
            result[i] = dictionary.search(prefixes[i]);
        }

        return result;
    }

}
