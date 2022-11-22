public class Kolo {
    private double radius;
    private double diametr;

    Kolo (double radius,double diametr) {
        this.radius = radius;
        this.diametr = diametr;
    }

    double getArea() {
        double area = (diametr * diametr) / 4 * Math.PI;
        return area;
    }
    double getLenght() {
        double lenght = 2*Math.PI*radius;
        return lenght;
    }

}
