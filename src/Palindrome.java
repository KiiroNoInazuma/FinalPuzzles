public class Palindrome {

    static boolean palindrome(String word) {
        for (int x = 0; x <= word.length() / 2; x++) {
            if (word.toLowerCase().charAt(x) == word.toLowerCase().charAt((word.length() - (x + 1)))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(palindrome("Комок"));
    }
}



