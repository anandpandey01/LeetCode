class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("\\s", ""); 
        str = str.replaceAll("[^a-zA-Z0-9]", "");  
        str = str.toLowerCase();  
        int right =  str.length()-1;
        int left=0;

        while(left<=right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++; right--;
        }

        return true;
        
    }
}