class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,-1);
        int prefix = 0;
        int maxlength = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                prefix += -1;
            }
            else{
                prefix += 1;
            }
         if (map.containsKey(prefix)) {

                int length = i - map.get(prefix);
                maxlength = Math.max(maxlength, length);

            } else {
                // Sirf pehli baar store karo
                map.put(prefix, i);
            }
    }

    return maxlength;
}
}