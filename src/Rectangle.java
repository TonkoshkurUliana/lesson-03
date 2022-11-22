
public class Rectangle {
    private double dovgina;
    private double shirina;

    Rectangle() {
        this.dovgina = 7.6;
        this.shirina = 15;
    }

    Rectangle(double dovgina, double shirina) {
        this.dovgina = dovgina;
        this.shirina = shirina;
    }

    double getRectangleArea() {
        double area = dovgina * shirina;
        return area;
    }

    double getRectanglePerimeter() {
        double perimetr = 2 * (dovgina + shirina);
        return perimetr;
    }
}
