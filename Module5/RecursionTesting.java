public class RecursionTesting {
    public static void main(String[] args) {
        System.out.println("CSU Global - CSC400 Module 5 - Critical Thinking Assignment");
        // Defining the testing value and getting our control result
        int testValue = 5;
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int controlResult = 1;
        int i = 2;

        while(i <= testValue) {
            controlResult *= i;
            i++;
        }

        System.out.println("Control result = " + controlResult);

        // Testing the first algorithm
        System.out.println("Testing the first algorithm: " + RecursAlgs.intRecurseAlg0(testValue));

        // Testing the second algorithm
        System.out.println("Testing the second algorithm: " + RecursAlgs.intRecurseAlg1(testValue));

        // Testing the array display in reverse order
        RecursAlgs.displayArrayInReverse(testArray);
    }
}