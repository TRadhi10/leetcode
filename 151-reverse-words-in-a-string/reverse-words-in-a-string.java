class Solution {
    public String reverseWords(String s) {
       int n = s.length();
        char[] result = new char[n];
        int resultIndex = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                int wordEnd = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                int wordStart = i + 1;
                for (int j = wordStart; j <= wordEnd; j++) {
                    result[resultIndex++] = s.charAt(j);
                }
                if (resultIndex < n) {
                    result[resultIndex++] = ' ';
                }
            }
        }
        
        if (resultIndex > 0 && result[resultIndex - 1] == ' ') {
            resultIndex--;
        }
        return new String(result, 0, resultIndex);
    }
}