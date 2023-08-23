class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1L = word1.length(); 
        int w2L = word2.length();
        StringBuilder tString = new StringBuilder(); //creates a StringBuilder object which allows us to append to the end of a null string
        int i = 0;
        while(i < w1L || i < w2L) {
            // append the character at i to the new string for word one and then word 2. 
            //NOTE: will need to check if there is a character there or if it's at the end of the string. 
            if (i < w1L) {
                tString.append(word1.charAt(i));
            }
            if (i < w2L) {
                tString.append(word2.charAt(i));
            }
            i++;
        }
        return tString.toString(); //has to be converted to a String from a StringBuilder
    }
}