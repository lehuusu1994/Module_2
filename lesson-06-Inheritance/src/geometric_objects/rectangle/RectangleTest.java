package geometric_objects.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(3.5,9.0);
        System.out.println(rectangle1);

        Rectangle rectangle2= new Rectangle("orange",false,5,10);
        System.out.println(rectangle2);
    }
}
