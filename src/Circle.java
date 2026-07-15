public class Circle extends Shape {
    //1. Fields | Properties | Attributes
    private double radius;

    //2. Constructors
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    //3. Methods
    //3.1. Getter/Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //3.2. Behavior Methods
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}