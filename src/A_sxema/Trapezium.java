package A_sxema;

public class Trapezium extends GeometrikFigure {
    private Double a;
    private Double b;
    private Double h;

    public Trapezium(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return ((a + b) / 2) * h;
    }

    @Override
    public double perimeter() {
        return a + b + 2 * Math.sqrt(Math.pow(h, 2) + Math.pow(((a - b) / 2), 2));
    }
}
