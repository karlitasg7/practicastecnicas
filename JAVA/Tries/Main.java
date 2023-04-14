package Tries;

public class Main {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("Day");
        trie.insert("Night");
        trie.insert("Week");
        trie.insert("Year");
        trie.insert("Yellow");
        trie.insert("Dark");

        System.out.println(trie.search("Day")); // true
        System.out.println(trie.search("Night")); // true
        System.out.println(trie.search("Week")); // true
        System.out.println(trie.search("Year")); // true
        System.out.println(trie.search("Yellow")); // true
        System.out.println(trie.search("Dark")); // true
        System.out.println(trie.search("Ye")); // true
        System.out.println(trie.search("Da")); // true
        System.out.println(trie.search("Wee")); // true

        System.out.println(trie.search("Weee")); // false
        System.out.println(trie.search("Morning")); // false
        System.out.println(trie.search("Darke")); // false
        System.out.println(trie.search("Yellowstone")); // false

    }

}
