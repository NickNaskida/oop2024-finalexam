package finalexam.task1;

public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void Draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return radius == other.radius;
    }
}
