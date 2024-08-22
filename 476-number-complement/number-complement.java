class Solution {
    public int findComplement(int num) {
        if (num == 0) {
            return ~0;
        }
        int numberOfBits = (int) (Math.log(num) / Math.log(2)) + 1;
        int bitmask = (1 << numberOfBits) - 1;
        return num ^ bitmask;
    }
}