class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
            int max=0;
            int sum=0;
            for(int k=0;k<candies.length;k++){
                if(candies[k]>max){
                    max=candies[k];
                }
            }
            
            for(int i=0;i<candies.length;i++){
                sum=candies[i]+extraCandies;
                if(sum>=max){
                     result.add(true);
                }
                else{
                    result.add(false);
                }
            }
           
        return result;
    }
}