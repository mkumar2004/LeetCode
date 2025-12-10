// import java.util.Arrays;

// class SumOfTwoNum {

//     public static void main(String[] args) {

//         int[] a = {2, 7, 11, 15};
//         int[] a2 = {3, 2, 4};
//         int[] a3 = {3, 3};

//         int t1 = 9;
//         int t2 = 6;

      
//         System.out.println(Arrays.toString(twoSum(a, t1)));
//         System.out.println(Arrays.toString(twoSum(a2, t2)));
//         System.out.println(Arrays.toString(twoSum(a3, t2)));
//     }

//     public static int[] twoSum(int[] nums, int target) {

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {

//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }

//             }
//         }

//         return new int[]{-1, -1}; 
//     }
// }
import java.util.*;
class SumOfTwoNum{
    public static int[] twofsum(int nums[],int target){
         ArrayList<Integer> n = new ArrayList<Integer>();

        int left =0 ,right = nums.length-1;
        
        while(left<right){
           int sum = nums[left]+nums[right];

            if(sum == target){
                n.add(left);
                n.add(right);
                
            }
            else if(sum>target){
                left++;
            }
            else{
                right--;
            }
        }
       return new int[]{n.get(0),n.get(1)};
       
    }

    public static void main(String args[]){
          int[] b ={1,2,3,7,9};
          int target = 5;
          int c[] =twofsum(b,target);

          System.out.println(Arrays.toString(c));
    }
}