public class Rectangle extends Shape {
    //1. Fields | Properties | Attributes
    private double width;
    private double height;

    //2. Constructors
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    //3. Methods
    //3.1. Getter/Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //3.2. Behavior Methods
    @Override
    public double area() {
        return this.width * this.height;
    }
}
