import java.util.*;

class Solution {

    public String frequencySort(String s) {

        // Step 1 : Count Frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2 : Create Max Heap
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        // Step 3 : Add all entries into heap
        maxHeap.addAll(map.entrySet());

        // Step 4 : Build Answer
        StringBuilder ans = new StringBuilder();

        while(!maxHeap.isEmpty()){

            Map.Entry<Character, Integer> entry =
                    maxHeap.poll();

            char ch = entry.getKey();

            int freq = entry.getValue();

            while(freq > 0){

                ans.append(ch);

                freq--;
            }
        }

        return ans.toString();
    }
}