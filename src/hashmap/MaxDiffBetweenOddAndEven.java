package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxDiffBetweenOddAndEven {
    public int maxDifference(String s) {

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();

        // Separate odd and even frequencies
        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                oddFreqs.add(freq);
            } else {
                evenFreqs.add(freq);
            }
        }

        int maxDiff = Integer.MIN_VALUE;

        // Compute all possible differences
        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }
        return maxDiff == Integer.MIN_VALUE ? 0 : maxDiff;
    }

    public static void main(String[] args) {
        String s = "aaaaabbc";
        MaxDiffBetweenOddAndEven maxDiffBetweenOddAndEven = new MaxDiffBetweenOddAndEven();
        System.out.println(maxDiffBetweenOddAndEven.maxDifference(s));
    }
}
