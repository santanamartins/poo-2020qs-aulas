public class Stopwatch {
    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();

        return (now - start) / 1000.0;
    }

    /**
     * Test client
     *
     * Soma as raizes dos n primeiros inteiros positivos
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: Stopwatch <n>");
        }

        int n = Integer.parseInt(args[0]);

        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;

        for (int i = 1; i <= n; i++) {
            sum1 += Math.sqrt(i);
        }

        double time1 = timer1.elapsedTime();

        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;

        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(i, 0.5);
        }

        double time2 = timer2.elapsedTime();

        System.out.printf("%e (%.3f s)\n", sum1, time1);
        System.out.printf("%e (%.3f s)\n", sum2, time2);
    }
}
