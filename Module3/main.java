public class main{
    public static void main(String[] args){
        int[] a = {3,6,5,1,4};
        int[] nums = {1,2,3,4,5,6};

        for(int i : a){
            for(int ii = 1; ii <= 6; ii++){
                if(i == nums[ii-1]){
                    nums[ii-1] = 0;
                }
            }
        }

        System.out.println("The missing number is: ");
        for(int i : nums){
            if(i != 0){
                System.out.println(i);
            }
        }
    }
}