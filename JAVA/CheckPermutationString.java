public class CheckPermutationString {

    public static void main(String[] args) {

        System.out.println(check("test", "t"));
        System.out.println(check("test", "estt"));
    }

    /*
     * Time O(n)
     * Space O(1)
     */
    private static boolean check(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        for (String letter : text2.split("")) {
            if (!text1.contains(letter)) {
                return false;
            }
        }
        return true;

    }

}
