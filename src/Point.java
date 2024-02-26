public class Point {

    double x,y;
    int id ;
    public Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point secondPoint){
        double d;
        d=Math.sqrt((secondPoint.x-this.x)*(secondPoint.x-this.x) +(secondPoint.y-this.y)*(secondPoint.y-this.y));
        return d;
    }
    public void not(){
        System.out.println("New point added to object");

    }
}
