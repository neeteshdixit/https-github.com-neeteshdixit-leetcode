class Solution {
    public String[] findRelativeRanks(int[] score) {
        int copy[] = score.clone();

        Arrays.sort(copy);
         HashMap<Integer, String> map = new HashMap<>();
          int rank = 1;
            for (int i = copy.length - 1; i >= 0; i--) {

            if (rank == 1)
                map.put(copy[i], "Gold Medal");

            else if (rank == 2)
                map.put(copy[i], "Silver Medal");

            else if (rank == 3)
                map.put(copy[i], "Bronze Medal");

            else
                map.put(copy[i], String.valueOf(rank));

            rank++;
        }

        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }
}
    