class Point {
    private double x,y;
    public Point(double x,double y)       {this.x=x;  this.y=y;}
    public Point(Point other)       {this.x=other.x;    this.y=other.y;}
    public void setx(double x)         {this.x=x;}
    public void sety(double y)         {this.y=y;}
    public double getx()               {return x;}
    public double gety()               {return y;}
}
public class Q3_Point {
    public static void main(String[] args) {
        Point p1=new Point(10,20);
        Point p2=new Point(p1);

        System.out.println("Before Modifying the Datas: ");
        System.out.println("Point 1 has X value: "+p1.getx()+" & Y value: "+p1.gety());
        System.out.println("Point 2 has X value: "+p2.getx()+" & Y value: "+p2.gety());

        p1.setx(100);       p1.sety(40);
        
        System.out.println("After Modifying the Values ----> ");
        System.out.println("Point 1 has X value: "+p1.getx()+" & Y value: "+p1.gety());
        System.out.println("Point 2 has X value: "+p2.getx()+" & Y value: "+p2.gety());

    }
}