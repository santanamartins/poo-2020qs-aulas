import java.awt.*;

public class OrphanedObjects {
    public static void main(String[] args) {
        Color a, b;

        a = new Color(160, 82, 45);
        b = new Color(255, 255, 0);

        // now the old identity of b is orphaned
        b = a;
    }
}
