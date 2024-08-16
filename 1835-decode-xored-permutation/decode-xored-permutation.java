class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }
        
        int xorEncoded = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            xorEncoded ^= encoded[i];
        }
        
        int first = xorAll ^ xorEncoded;
        int[] perm = new int[n];
        perm[0] = first;
        
        for (int i = 0; i < encoded.length; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        
        return perm;
    }
}
