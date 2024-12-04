import model.Point;
import org.postgresql.Driver;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.move(1);

        Driver driver = new Driver();
    }
}