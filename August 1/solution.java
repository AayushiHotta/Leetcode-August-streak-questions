class Solution {
    public int countSeniors(String[] details) {
        //initially the count of senior citizens is 0
        int count = 0;
        for(int i = 0; i < details.length; i++){
            String s = details[i];
            //The 11th and 12th term form the age of the passenger
            // Integer.parseInt() method is used to convert a string to integer
            int age = Integer.parseInt(s.substring(11, 13));
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}
