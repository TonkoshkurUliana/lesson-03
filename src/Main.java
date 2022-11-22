public class Main {

    public static void main(String[] args) {
        double radius;
        double diametr;

        Kolo myCircle = new Kolo(5.5, 11.0);
        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(15, 20);

        System.out.println("Довжина кола: " + myCircle.getLenght());
        System.out.println("Площа кола: " + myCircle.getArea());

        System.out.println("Площа прямокутника (без параметрів): " + myRectangle.getRectangleArea());
        System.out.println("Периметр прямокутника (без параметрів): " + myRectangle.getRectanglePerimeter());

        System.out.println("Площа прямокутника (з параметрів): " + myRectangle2.getRectangleArea());
        System.out.println("Периметр прямокутника (з параметрів): " + myRectangle2.getRectanglePerimeter());
    }
}
