package Tries.WordSearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();

        char[][] board =
                new char[][]{
                        new char[]{'p', 'e', 'r', 'o'},
                        new char[]{'a', 't', 'a', 'e'},
                        new char[]{'t', 'e', 'l', 'v'},
                        new char[]{'o', 'f', 'l', 'v'}
                };

        String[] words = new String[]{"pero", "pato", "comida", "veo", "pata"};

        List<String> result = wordSearch.findWords(board, words);
        Collections.sort(result);
        System.out.println(Arrays.toString(result.toArray()));
    }

}
