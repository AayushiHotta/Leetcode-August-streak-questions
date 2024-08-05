import java.util.HashMap;

class Solution {
  public String kthDistinct(String[] arr, int k) {
    // Create a HashMap to store the frequency of each string in the array
    HashMap<String, Integer> map = new HashMap<>();

    // Iterate through the array and count the occurrences of each string
    for (String s : arr) {
      // If the string is already in the map, increment its count by 1
      // Otherwise, add the string to the map with a count of 1
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    
    // Iterate through the array again to find the k-th distinct string
    for (String s : arr) {
      // Check if the string appears exactly once in the array
      if (map.get(s) == 1) {
        // Decrement k for each distinct string found
        k--;
      }

      // If k reaches 0, return the current string as it is the k-th distinct string
      if (k == 0) return s;
    }

    // If no k-th distinct string is found, return an empty string
    return "";
  }
}
