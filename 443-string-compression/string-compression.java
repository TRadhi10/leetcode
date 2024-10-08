public class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0;
        int readIndex = 0;

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int start = readIndex;
            
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
            }
            int count = readIndex - start;
            
            chars[writeIndex++] = currentChar;
            
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = digit;
                }
            }
        }
        
        return writeIndex;
    }
}
