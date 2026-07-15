public class Main {
    public static void main(String[] args) {
        //1. Khởi tạo đối tượng
        Shape s1 = new Rectangle(2.0, 3.0);
        Shape s2 = new Circle(1.0);

        //2. Downcasting để truy cập thuộc tính riêng của từng lớp con
        Rectangle rect = (Rectangle) s1;
        Circle circle = (Circle) s2;

        //3. Gọi area()
        System.out.printf("Diện tích hình chữ nhật (%.1f x %.1f): %.2f\n",
                rect.getWidth(), rect.getHeight(), s1.area());
        System.out.printf("Diện tích hình tròn (r=%.1f): %.2f\n",
                circle.getRadius(), s2.area());
    }
}