// import scanner.demo01;

public class run {
    public static void main(String[] args) {
        // demo01.scanKeyBroadNextLine();
        System.out.println(f(20));
    }

    public static void forNumeber() {
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int x : numbers) {
            System.out.println(x);
        }
    }

    public static long f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (long) n * f(n - 1);
        }
    }
}
