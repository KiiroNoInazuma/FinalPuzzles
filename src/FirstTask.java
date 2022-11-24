public class FirstTask {

    static int getWholeRandom(int a, int b) {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(b - a + 1) + a;
    }


    public static void main(String[] args) {
        int x = getWholeRandom(5, 10);
        System.out.println(x);
    }
}
