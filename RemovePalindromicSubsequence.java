class Solution {
    
    // It is subsequences, not substring!!!
    public int removePalindromeSub(String s) {
        if (s == null || s.length() == 0) return 0;
        if (isPalindrome(s)) return 1;
        return 2;
    }
    
    private boolean isPalindrome(String s) {
        if (s == null) return true;
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}