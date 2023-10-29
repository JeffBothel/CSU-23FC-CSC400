class RecursAlgs {

    // Recursion algorithm 1
    public static int intRecurseAlg0(int n) {
        // WORKING NOTE: Decided to have this come first and then proceed with the if-else checks
        if(n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        if (n >= 0 && n <= 1) {
            return 1;
        } 
        else {
            return n * intRecurseAlg0(n - 1);
        }
    }

    // Recursion algorithm 2
    public static int intRecurseAlg1(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        if (n >= 0 && n <= 1) {
            return 1;
        } 
        else {
            int count[] = {2};
            // WORKING NOTE: Needed to adjust from psuedocode as the extra 2 * I had in there to estbalish a base for the factorials was not needed
            return intRecurseAlg1(n, count);
        }
    }

    // Recursion algorithm 2 overload
    // WORKING NOTE: I needed to adjust from the psuedocode the count as an array and account for this to allow variable "pointing" instead of individual variables
    private static int intRecurseAlg1(int n, int[] count){
        if(count[0] < (n-1)) {
            // WORKING NOTE: Needed to adjust from psuedocode as the incrementation of the count value as not working corectly
            int output;
            count[0]++;
            output = (count[0] -1) * intRecurseAlg1(n, count);
            return output;
        }
        else {
            return count[0] * n;
        }
    }

    // Display the values of an array in reverse order
    public static void displayArrayInReverse(int[] array) {
        int[] index = {array.length - 1};
        System.out.println("Displaying the array in reverse order:");
        if(index[0] == 0) {
            System.out.println(array[index[0]]);
        }
        else {
            displayArrayInReverse(array, index);
        }
    }

    private static void displayArrayInReverse(int[] array, int[] index) {
        System.out.println("Array index " + index[0] + " = " + array[index[0]]);
        if(index[0] > 0) {
            index[0]--;
            displayArrayInReverse(array, index);
        }
    }
}