package Tries.TitleSuggestions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TitleSuggestions titleSuggestions = new TitleSuggestions();

        String[] books    = new String[]{"Whatever", "Book 1", "water", "Book 35"};
        String[] prefixes = new String[]{"Wo", "Wa", "Boo", "fr"};

        System.out.println(
                Arrays.toString(titleSuggestions.titleSuggestions(books,
                                                                  prefixes,
                                                                  false))
        ); // new boolean[]{false, false, true, false}.

        System.out.println(
                Arrays.toString(titleSuggestions.titleSuggestions(books,
                                                                  prefixes,
                                                                  true))
        ); // new boolean[]{false, true, true, false}
    }

}
