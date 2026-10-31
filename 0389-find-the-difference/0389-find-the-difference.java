class Solution {
    public char findTheDifference(String s1, String s2) {
         char ans = 0;

        for (int i = 0; i < s1.length(); i++) {
            ans ^= s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            ans ^= s2.charAt(i);
        }
        return ans;
    }
}