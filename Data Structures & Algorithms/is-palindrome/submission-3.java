class Solution {
    public boolean isPalindrome(String s) {
        char[] ca = s.toCharArray();
        int l = 0;
        int r = ca.length - 1;
        while(l < r){
            boolean left = Character.isLetterOrDigit(ca[l]);
            boolean right = Character.isLetterOrDigit(ca[r]);
            if(left && right){
                if(!(ca[l] == ca[r] || Character.isLetter(ca[l]) && Math.abs(ca[l]-ca[r]) == 32)){
                    return false;
                }
                l++;
                r--;
            }
            else{
                if(!left){
                    l++;
                }
                if(!right){
                    r--;
                }
            }
        }
        return true;
    }
}
