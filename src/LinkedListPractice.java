import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Element 1");
        myList.add("Element 3");
        myList.add("Element 2");
        myList.add("Element 4");
        myList.add("Element 7");
        myList.add("Element 6");

        System.out.println("Current Data in LinkedList: " + myList);

        myList.addFirst("Element 0");
        myList.addLast("Element 9");

        System.out.println("Current Data in LinkedList: " + myList);

        //Get value from LL
        System.out.println(myList.get(1));

        //set New Value
        myList.set(1, "New Element");

        System.out.println("Current Data in LinkedList: " + myList);
        System.out.println("Middle element in LinkedList is: " + getMiddleElement(myList));
    }

    private static String getMiddleElement(LinkedList<String> myList) {
        return myList.get(myList.size() / 2).toString();
    }


}
