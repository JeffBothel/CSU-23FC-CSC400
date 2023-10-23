public class main {
    private static void intBubbleSort(int[] array, int opsCount) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                // if numbers[j-1] > numbers[j], swap the elements
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println("Swapped " + array[j - 1] + " and " + array[j] + ". Operation count: " + (++opsCount));
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble sort demo");
        int[] testArray = {18, 34, 22, 54, 78, 89, 99, 87, 65, 43, 21, 9, 5, 6, 7, 8, 3, 2, 1};
        int opsCount = 0;
        intBubbleSort(testArray, opsCount);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}