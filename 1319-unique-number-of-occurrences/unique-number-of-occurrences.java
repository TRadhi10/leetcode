class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mapping=new HashMap<>();
        for(int num: arr){
            mapping.put(num,mapping.getOrDefault(num,0)+1);
        }
        Set<Integer> dup=new HashSet<>(mapping.values());
        return mapping.values().size()==dup.size();
    }
}