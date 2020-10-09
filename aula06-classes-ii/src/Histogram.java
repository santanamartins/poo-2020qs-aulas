import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {
    private final double[] freq;
    private double max;

    public Histogram(int n) {
        freq = new double[n];
        max = 0.0;
    }

    public void setFreq(int i, int value) {
        freq[i] = value;
        if (value > max)
            max = value;
    }

    /**
     * Incrementa a frequencia do elemento i
     * @param i
     */
    public void addDataPoint(int i) {
        // TODO: incrementar a freq e restabelecer o max
    }

    public void draw() {
        StdDraw.setYscale(-1, max + 1);
        StdStats.plotBars(freq);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: Histogram <histFile>");
        }

        try (Scanner scanner = new Scanner(new File(args[0]))) {
            var nPoints = scanner.nextInt();
            var histogram = new Histogram(nPoints);

            for (int i = 0; i < nPoints; i++) {
                histogram.setFreq(i, scanner.nextInt());
            }
            StdDraw.setCanvasSize(1000, 500);
            histogram.draw();

        } catch (FileNotFoundException e) {
            System.err.println("Failed to open input file");
            e.printStackTrace();
        }
    }


}
