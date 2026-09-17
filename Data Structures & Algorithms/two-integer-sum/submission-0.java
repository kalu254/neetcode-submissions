class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
        * Create a hashmap where the key is first number and value is the 
        * position such that for every iteration you compare the keys in 
        * the map to see if they contain a compliment(to the target),if it exists use
        * the key (the compliment) to fetch the index. If the iteration
        * ends without a success return noPair array of negative indexes.
        **/
        int[] noPair = {-1, -1};
        if(nums.length < 2) return noPair;
        HashMap<Integer,Integer> complimentPair = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(complimentPair.containsKey(compliment)){
                int[] pair = {complimentPair.get(compliment), i};
                return pair;
            }else{
               complimentPair.put(nums[i],i);
            }
        }

        return noPair;
    }
}
