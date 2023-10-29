
package circle;

public class Circle {
    private double pi = 3.14;
    private double diametro = 11;
    private double radius;
    private double area;
    private double perimetro;

    public Circle(double area, double perimeter) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Circle() {
        radio1();
        area1();
        perimetro1();
    }

    private void radio1() {
        this.radius = diametro / 2;
    }

    private void area1() {
        this.area = PI * Math.pow(radius, 2);
    }

    private void perimetro1() {
        this.perimetro = 2 * PI * radius; 
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("el area del circulo es " + c.getArea());
        System.out.println("el perimetro del circulo es " + c.getPerimetro());
    }
}
