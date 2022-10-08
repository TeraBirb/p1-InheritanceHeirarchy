public class Circle extends TwoDimensionalShape{

    String ID;
    Point center;
    double radius;
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getID() {
        return ID;
    }

    public void move(int x, int y, int z) {
        center.setX(this.center.getX() + x);
        center.setY(this.center.getY() + y);
        center.setZ(this.center.getZ() + z);
    }

    public Circle(Point c, double r, String id) {
        this.center = c;
        this.radius = r;
        this.ID = id;
    }

    public String toString() {
        return String.format("%s: Center: %o,%o,%o Radius: %f", ID, center.getX(), center.getY(), center.getZ(), radius);
    }
}
