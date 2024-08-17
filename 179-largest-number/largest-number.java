class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        
        int n = s.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((s[j] + s[j + 1]).compareTo(s[j + 1] + s[j]) < 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append(str);
        }
        
        return result.charAt(0) == '0' ? "0" : result.toString();
    }
}
