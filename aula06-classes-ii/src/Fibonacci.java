public class Fibonacci {
    public static long naiveFibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return naiveFibonacci(n-1) + naiveFibonacci(n-2);
    }

    public static long fastFibonacci(long n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        long f0 = 0;
        long f1 = 1;
        long f2 = f0 + f1;

        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }

        return f2;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: Fibonacci <n>");
        }

        int n = Integer.parseInt(args[0]);

        Stopwatch timer1 = new Stopwatch();
        long fib1 = naiveFibonacci(n);
        double time1 = timer1.elapsedTime();

        Stopwatch timer2 = new Stopwatch();
        long fib2 = fastFibonacci(n);
        double time2 = timer2.elapsedTime();

        System.out.printf("%d %.3f\n", fib1, time1);
        System.out.printf("%d %.3f\n", fib2, time2);

    }
}
