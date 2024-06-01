package A_sxema;

public class Rectangle extends GeometrikFigure {
    private Double a;
    private Double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return a + b;
    }
}
