package A_sxema;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println("rektangle yuzi = "+rectangle.area());
        System.out.println("rektangle peremetri = "+rectangle.perimeter());

        Trapezium trapezium = new Trapezium(5,4,3);
        System.out.println("trapezium yuzi = "+trapezium.area());
        System.out.println("trapezium peremetri = "+trapezium.perimeter());

        Triangle triangle = new Triangle(5,4,3);
        System.out.println("triangle yuzi = "+triangle.area());
        System.out.println("triangle peremetri = "+triangle.perimeter());
    }
}
