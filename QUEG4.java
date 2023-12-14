import java.util.Scanner;
public class QUEG4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square: ");
        double side = sc.nextDouble();

        Geometry Square = new Geometry(side);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the weidth of rectangle: ");
        double weidth = sc.nextDouble();

        Geometry rectangle = new Geometry(length, weidth);

        System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();

        Geometry circle = new Geometry(radius);

        System.out.println("Area of Square : " +Square.getAreaOfSquare());
        System.out.println("Area of rectangle : " +rectangle.getAreaOfrectangle());
        System.out.println("Area of circle : " +circle.getAreaOfcircle());
    }
}

class Geometry {
    private double side;
    private double length;
    private double weidth;
    private int radius;

    public Geometry (double side) {
        this.side = side;
    }

    public Geometry (double length, double weidth) {
        this.length = length;
        this.weidth = weidth;
    }

    public Geometry (int radius) {
        this.radius = radius; 
   }

    public double getAreaOfSquare() {
        return this.side*side;
    }

    public double getAreaOfrectangle() {
        return this.length * this.weidth;
    }

    public double getAreaOfcircle() {
        return 3.14159 * (this.radius * this.radius);
    }

}