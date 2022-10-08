public class Sphere extends ThreeDimensionalShape{
    String ID;
    Point center;
    double radius;

    public String getID() {
        return ID;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public void move(int x, int y, int z) {
        center.setX(this.center.getX() + x);
        center.setY(this.center.getY() + y);
        center.setZ(this.center.getZ() + z);
    }

    public Sphere(Point c, double r, String id) {
        this.center = c;
        this.radius = r;
        this.ID = id;
    }

    public String toString() {
        return String.format("%s: Center: %o,%o,%o Radius: %f", ID, center.getX(), center.getY(), center.getZ(), radius);
    }

}
