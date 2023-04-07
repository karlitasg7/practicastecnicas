package Exercism__0001__PangramChecker;

public class PangramChecker {
    
    public boolean isPangram(String input) {

        return 26 == input
                .toLowerCase()
                .replaceAll("[^a-z]", "")
                .chars()
                .distinct()
                .count();

    }

}
