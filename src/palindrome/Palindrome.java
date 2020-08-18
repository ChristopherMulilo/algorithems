package palindrome;

public class Palindrome {

    public static void main(String[] args) {

        String name = "sss1s";
        String name1 = "MOM";

        // palindromChecker(name1);

        if (palindromChecker(name1)){
            System.out.println("true");
    }
        else{
            System.out.println("No");
        }

    }

    public static boolean palindromChecker(String ord) {

            int fPointer = 0;
            int lPointer = ord.length() - 1;

            while (fPointer < lPointer) {
                if (ord.charAt(fPointer) != ord.charAt(lPointer)) {
                   return false;
                }

                else{
                fPointer++;
                lPointer--;
                }
            } return true;
    }
}
