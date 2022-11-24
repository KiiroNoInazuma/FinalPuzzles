public class Divisors {

    static void positiveDivisors(int num) {
        int div = 1;
        while (div <= num) {
            if (num % div == 0)
                System.out.println(div);
            div++;
        }
    }

    public static void main(String[] args) {
        positiveDivisors(13);
    }
}
