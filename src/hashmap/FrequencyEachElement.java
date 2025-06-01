package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyEachElement {
    public static void frequency(int []arr){
        Map<Integer, Integer> map = new HashMap<>();

        // Populate the map with element frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Element | Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "     |     " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7};
        frequency(arr);
    }
}
