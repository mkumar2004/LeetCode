class Solution {
    public static int majorityElement(int[] nums) {
        int count =0;
        Integer candicate = null;
        for(int num:nums){
            if(count == 0){
                candicate =num;
            }
            count+=(num == candicate)?-1:1;
        }
        return candicate;

    }
    public static void main(String args[]){
       int[] nums = {3,2,3};
       int[] nums2 = {2,2,1,1,1,2,2};
        majorityElement(nums);
        majorityElement(nums2);
    }
    }