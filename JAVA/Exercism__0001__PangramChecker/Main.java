package Exercism__0001__PangramChecker;

public class Main {

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();

        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog")); // true
        System.out.println(pangramChecker.isPangram("abc")); // false
        System.out.println(pangramChecker.isPangram("\"Five quacking Zephyrs jolt my wax bed.\"")); // true

    }
}
