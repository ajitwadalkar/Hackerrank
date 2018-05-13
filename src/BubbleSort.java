import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray = {1, 6, 2, 4, 5, 8, 9};
        bubbleSort(unsortedArray);
    }

    public static void bubbleSort(int[] unsorted) {
        System.out.println("unsorted array before sorting : " + Arrays.toString(unsorted));
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 1; j < unsorted.length - i; j++) {
                if (unsorted[j - 1] > unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(unsorted));
    }
}
