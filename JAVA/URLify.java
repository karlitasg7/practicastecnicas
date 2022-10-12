public class URLify {

    public static void main(String[] args) {

        // solution1();
        solution();

    }

    private static void solution1() {
        String text = "Mr John Smith    ";

        System.out.println(text);

        text = text.trim();
        System.out.println(text.length());
        text = text.replaceAll(" ", "%20");
        System.out.println(text);
    }

    private static void solution() {
        String text = "Mr John Smith    ";
        char[] arr = text.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;

        System.out.println(text);
        System.out.println(trueLength);
        replaceSpaces(arr, trueLength);
    }

    /*
     * Time O(n)
     * Space O(1)
     */
    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    /*
     * time O(n)
     * space O(1)
     */
    private static void replaceSpaces(char[] str, int trueLength) {
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;
        if (newIndex + 1 < str.length)
            str[newIndex + 1] = '\0';

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -= 1) {
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }

        System.out.println(str);

    }

    /*
     * Time O(n)
     * Space O(1)
     */
    private static int countOfChar(char[] str, int start, int end, int target) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (str[i] == target) {
                count++;
            }
        }
        return count;
    }

}
