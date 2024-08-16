class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 0, resultIndex = 0;
        
        while (posIndex < positives.size() && negIndex <negatives.size()) {
            result[resultIndex++] = positives.get(posIndex++);
            result[resultIndex++] = negatives.get(negIndex++);
        }
        
        return result;
    }
    }
