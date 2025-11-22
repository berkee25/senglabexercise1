public class Cylinder {
    public double r;
    public double h;
    public static int noOfCylinder = 0;

    public Cylinder() {
        this(3, 4);
    }

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        noOfCylinder++;
    }

    public static int getNoOfCylinder() {
        return noOfCylinder;
    }

    double calculateBaseArea() {
        return r*r*Math.PI;
    }

    double calculateSurfaceArea() {
        return 2*Math.PI*r*(r+h);
    }

    double calculateVolume() {
        return Math.PI*r*r*h;
    }

    double calculateMass(double density) {
        return calculateVolume()*density;
    }
}
