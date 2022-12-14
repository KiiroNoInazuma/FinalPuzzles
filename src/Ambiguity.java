public class Ambiguity {

    static int multiDigitNumber(int num) {
        int sum = 0;
        for (int i = 1; i < (int) Math.pow(10, String.valueOf(num).length()); i *= 10) {
            sum += num % (i * 10) / i;
        }
        return sum;
    }

    static char multiDigitNumberChar(int num) {
        char number = 0;
        char[] chars = String.valueOf(num).toCharArray();
        for (char ch : chars) {
            number += ch;
        }
        return number;
    }

    static int task(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(task(123));
    }
}
