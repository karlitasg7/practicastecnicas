package Graphs.BuildOrder;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        BuildOrder buildOrder = new BuildOrder();

        String[] projects = {"a", "b", "c", "d"};
        String[][] dependencies = {
                {"a", "b"}, {"a", "c"}, {"a", "d"}, {"c", "b"}, {"d", "b"}, {"d", "c"}
        };

        List<String> result = buildOrder.buildOrder(projects, dependencies);
        System.out.println(result);

        String[][] cycleDependencies = {{"a", "b"}, {"b", "c"}, {"c", "d"}, {"d", "a"}};

        buildOrder.buildOrder(projects, cycleDependencies);

    }

}
