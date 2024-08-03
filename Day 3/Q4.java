class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
       int[] count1 = new int[1001];
       int[] count2 = new int[1001];
       for(int v : target){
         ++count1[v];
       }
       for(int v : arr){
         ++count2[v];
       }
       return Arrays.equals(count1, count2);
    }
}
