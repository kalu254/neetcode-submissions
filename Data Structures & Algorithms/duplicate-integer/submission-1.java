class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        HashSet<Integer> set = new HashSet<Integer>(); 
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return !(set.size() == nums.length);
    }
}