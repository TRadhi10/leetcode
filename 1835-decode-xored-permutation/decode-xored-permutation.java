class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        
        int totalXor = 0;
        for (int i = 1; i <= n; i++) {
            totalXor ^= i;
        }
        
        int encodedXor = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            encodedXor ^= encoded[i];
        }
        
        perm[0] = totalXor ^ encodedXor;
        
        for (int i = 0; i < encoded.length; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        
        return perm;
    }
}
    