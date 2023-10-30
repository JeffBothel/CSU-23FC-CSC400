public class DiscussionCode {
    public static int[] intMergeSort(int[] inArray) {
        switch(inArray.length) {
            case 0:
            case 1:
                return inArray;
            case 2:
                if(inArray[0] > inArray[1]) {
                    int temp = inArray[0];
                    inArray[0] = inArray[1];
                    inArray[1] = temp;
                }
                return inArray;
            default:
                int[] arrayLeft = new int[inArray.length/2];
                int[] arrayRight = new int[inArray.length - arrayLeft.length];

                int ii = 0;
                for(int i = 0; i < arrayLeft.length; i++) {
                    arrayLeft[i] = inArray[ii++];
                }
                for(int i = 0; ii < inArray.length; i++) {
                    arrayRight[i] = inArray[ii++];
                }

                intMergeSort(arrayLeft);
                intMergeSort(arrayRight);

                ii = 0;
                for(int i = 0; i < arrayLeft.length; i++) {
                    inArray[ii++] = arrayLeft[i];
                }
                for(int i = 0; ii < inArray.length; i++) {
                    inArray[ii++] = arrayRight[i];
                }

                int i = 0;
                while(i < inArray.length) {
                    if(inArray[i] > inArray[i+1]) {
                        int temp = inArray[i];
                        inArray[i] = inArray[i+1];
                        inArray[i+1] = temp;
                    }
                    else if(inArray[i] == inArray[i+1] || inArray[i] < inArray[i+1]) {
                        i++;
                    }
                }
                return inArray;
        }
    }
}
