public class TestingSorting {
    public static boolean TestAscendingSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("CSU Global 23FC - CSC400 Module 6 - Testing sorting is ascending odered");
        int[] array0 = {1, 2, 3, 4, 5};
        int[] array1 = {32, 16, 73, 1, 54, 2, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] array2 = {9, 13, 8, 16, 15, 14, 12, 11, 10, 32, 1, 54, 2, 73, 16};
        int[] array3 = {8, -1, -25, 5, 4, 19, 7, 6, 1, 0, 2, 3, 4, 5, 6, 7};
        int[] array4 = {-8, -5, -3, -1, 0, 1, 3, 5, 8};
        int[] array5 = {8, 5, 3, 1, 0, -1, -3, -5, -8};
        int[] array6 = {8, 5, 3, 1, 0, -1, -3, -5, -8, 0};
        System.out.println("Array 0 is sorted in ascending order: " + TestAscendingSort(array0));
        System.out.println("Array 1 is sorted in ascending order: " + TestAscendingSort(array1));
        System.out.println("Array 2 is sorted in ascending order: " + TestAscendingSort(array2));
        System.out.println("Array 3 is sorted in ascending order: " + TestAscendingSort(array3));
        System.out.println("Array 4 is sorted in ascending order: " + TestAscendingSort(array4));
        System.out.println("Array 5 is sorted in ascending order: " + TestAscendingSort(array5));
        System.out.println("Array 6 is sorted in ascending order: " + TestAscendingSort(array6));
    }
}