import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 2, 5, 6, 7, 8};
        Integer[] arrayWithoutDiplicates = {1, 2, 3, 4, 5, 6, 7, 9, 8};
        System.out.println("arrayWithDuplicate: " + arrayWithDuplicates.toString());
        System.out.println("arrayWithOutDuplicate: " + arrayWithoutDiplicates.toString());
        System.out.println();
        System.out.println("Duplicates *" + checkDuplicate(arrayWithDuplicates) + "* in arrayWithDuplicate");
        System.out.println("Duplicates *" + checkDuplicate(arrayWithoutDiplicates) + "* in arrayWithoutDuplicate");
        System.out.println();
        duplicateElements(arrayWithDuplicates);
    }

    private static void duplicateElements(Integer[] arrayToTest) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (Integer i : arrayToTest) {
            if (myMap.containsKey(i)) {
                myMap.put(i, myMap.get(i) + 1);
            } else {
                myMap.put(i, 1);
            }
        }

        for (Integer i : myMap.keySet()) {
            if (myMap.get(i) > 1) {
                System.out.println("Element: " + i + " count: " + myMap.get(i));
            }
        }
    }

    private static String checkDuplicate(Integer[] arrayToTest) {
        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arrayToTest));
        if (mySet.size() < arrayToTest.length) {
            return "presents";
        } else {
            return "Not present";
        }
    }
}
