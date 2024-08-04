class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();       
             }
        int val = sc.nextInt();
        int result = solution.removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + result);
        System.out.print("Modified Array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}