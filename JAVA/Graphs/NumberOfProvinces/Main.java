package Graphs.NumberOfProvinces;

public class Main {

    public static void main(String[] args) {
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

        int[][] first = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(numberOfProvinces.numberOfProvinces(first));

        int[][] second = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(numberOfProvinces.numberOfProvinces(second));
    }

}
