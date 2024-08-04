class Solution {
public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        int majorityElement = 0;
        int threshold = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                majorityElement = entry.getKey();
                break;
            }
        }

        return majorityElement;
    }
}