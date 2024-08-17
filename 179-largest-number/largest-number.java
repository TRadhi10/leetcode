class Solution {
    public String largestNumber(int[] nums) {
            String[] strNums = Arrays.stream(nums)
                                  .mapToObj(String::valueOf)
                                  .toArray(String[]::new);
        
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        if (strNums[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    
             
        }
    }
