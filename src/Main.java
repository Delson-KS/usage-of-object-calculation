import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Shape shape ;
        File file = new File("/Users/kaiyrkeldi_sagitzan/CLionProjects/patternObserver/src/adresses");
        Scanner read = new Scanner(file);
        shape = new Shape();

        while (read.hasNext()) {
            String adress = read.next();
            String[] onlyXandY = adress.split(",");

            double x = Double.parseDouble(onlyXandY[0]);
            double y = Double.parseDouble(onlyXandY[1]);


            Point point = new Point(x, y);
            shape.add(point);
        }
        System.out.println("Perimeter: " +shape.calculatePerimeter());
        System.out.println("Longest distance: " +shape.longestDistance());
        System.out.println("Average Side: " + shape.averageSide());
    }
}