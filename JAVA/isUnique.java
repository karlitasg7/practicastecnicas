import java.util.HashSet;
import java.util.Set;

/*
 * This algorithm is used to validate if a string has only unique characters or not
 *
 */
public class isUnique {

    public static void main(String[] args) {
        System.out.println(valid("hi"));
        System.out.println(valid("test"));
        System.out.println(valid("other"));

        // second algorithm

        System.out.println("Second algorithm.....");
        System.out.println(valid2("hi"));
        System.out.println(valid2("test"));
        System.out.println(valid2("other"));
    }

    /*
     * This algorithm is using additional data structures
     * Time O(n)
     * space O(1)
     */
    private static boolean valid(String text) {
        Set<Character> setWord = new HashSet<Character>(text.length());

        for (char letter : text.toCharArray()) {

            if (setWord.contains(letter)) {
                return false;
            }

            setWord.add(letter);

        }

        return true;
    }

    /*
     * this algorithm valid the same but not using additional data structures
     *
     * Time O(n2)
     * Space O(n)
     */
    private static boolean valid2(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

}
