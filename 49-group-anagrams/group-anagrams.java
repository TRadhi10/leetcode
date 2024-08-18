class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> store = new HashMap<>();
        
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            
            if (!store.containsKey(sortedStr)) {
                store.put(sortedStr, new ArrayList<>());
            }
            store.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(store.values());
    }
}