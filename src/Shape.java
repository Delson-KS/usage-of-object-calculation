import java.util.ArrayList;
import java.util.List;

public class Shape {

    List<Point> container = new ArrayList<>();

    public void add(Point point){
        container.add(point);
        point.not();

    }
    public void addPoint(Point singlePoint){
        container.add(singlePoint);
    }
    public double calculatePerimeter(){
        double Perimeter=0;

        for(int i=1;i< container.size();i++) {
            Perimeter += container.get(i).distanceTo(container.get(i-1));
        }
        Perimeter+=container.get(container.size()-1).distanceTo(container.get(0));
        return Perimeter;
    }
    public double longestDistance() {
        double longest = 0;
        for (int i = 1; i < container.size(); i++) {
            if (container.get(i).distanceTo(container.get(i - 1)) > longest) {
                longest = container.get(i).distanceTo(container.get(i - 1));
            }
        }
        if (container.get(container.size() - 1).distanceTo(container.get(0)) > longest) {
            longest = container.get(container.size() - 1).distanceTo(container.get(0));
        }
        return longest;
    }
    public double averageSide(){
        double avg;
        avg = (calculatePerimeter()/container.size());
        return avg;
    }
}
