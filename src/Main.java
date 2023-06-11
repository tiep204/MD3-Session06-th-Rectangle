import ra.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.5,4.3);
        System.out.println(rectangle.display());
        System.out.println("Dien tich hinh chu nhat la: "+rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat la: "+rectangle.getPerimeter());
    }
}