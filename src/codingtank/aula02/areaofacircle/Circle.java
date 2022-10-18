package codingtank.aula02.areaofacircle;

public class Circle {
    private double radius;
    private double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * this.radius * this.radius;
    }

    double getArea() {
        return this.area;
    }
}
