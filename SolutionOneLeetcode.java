import java.util.Arrays;

/*Leetcode problem 1 : add two numbers in an array that equals the target number. Placed the two numbers' indices into an array
 * So {2,7,11,12} with a target of 9 would result in output of [0,1]
 * Developed by Linda L. Halpin 01-15-2025
 */

public class SolutionOneLeetcode {
    public static void main(String[] args){
        SolutionOneLeetcode solution = new SolutionOneLeetcode();    
        
        //case 1 output is [0,1]
        //int[] numArray = {2,7,11,12};
        //int targetNum = 9;
        
        //case 2 output is [1,2]
        //int[] numArray = {3,2,4};
        //int targetNum = 6;

        //case 3 output is [0,1]
        int[] numArray = {3,3};
        int targetNum = 6;
        
        int[] finArray = new int[2];
        finArray = solution.twoSum(numArray, targetNum);
        System.out.println(Arrays.toString(finArray));
    }
        /*find the numbers that adds up to the target and get the indices of the numbers in the array and placed them into an
        int array that will be returned. */
        public int[] twoSum(int[] nums, int target) {
            int[] tmpArray = new int[2];
            for(int i=0; i<nums.length; i++){
                System.out.println("Outer loop i="+i);
               
                for (int j=i+1; j<nums.length; j++){
                    System.out.println("inner loop j="+j);

                    if (nums[i]+nums[j]==target){                        
                        //adding the index of array to tmpArray to be returned
                        System.out.println("i="+i);
                        System.out.println("j="+j);
                        tmpArray[0] = i;
                        tmpArray[1] =j;
                        break;
                    }
    
                }
            }
            return tmpArray;
        }
        

}

    

