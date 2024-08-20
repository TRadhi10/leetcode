class Solution {
    public int searchInsert(int[] nums, int target){
        int temp=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               temp=i;
            }
            else if(target<nums[0]){
                   temp=0;
            }
            else if(nums[i]!=target){
                if(nums[i]>target && nums[i-1]<target){
                    temp=i;                
                    }
            }
                 if(target>nums[nums.length-1])  {
                    temp=nums.length;
                 }
         }
         
         return temp;
    }
}

   