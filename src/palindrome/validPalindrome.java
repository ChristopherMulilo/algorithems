package palindrome;

public class validPalindrome {
    public static void main(String[]args){
        String myString ="kltke";

       System.out.println(validPalindrome(myString));

    }

    public static boolean validPalindrome(String s){
 int i = 0;
 int j = s.length()-1;

 while(i < j){
     if(s.charAt(i) != s.charAt(j)){

         return isPalindrome(s, i+1, j)|| isPalindrome(s, i, j-1);
     }
     i++;
     j--;
 }
        return true;
    }

    public static boolean isPalindrome(String s, int pstart, int pend){
        while(pstart < pend){
            if(s.charAt(pstart++) != s.charAt(pend--))
                return false;

        }
        return true;
    }
}
