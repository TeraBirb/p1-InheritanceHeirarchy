public class Line extends OneDimensionalShape{
    public double getLength() {
        return Math.sqrt( (end.getX() - start.getX()) + (end.getY() - start.getY()) + (end.getZ() - start.getZ()) );
    }

    String ID;
    Point start;
    Point end;

    public String getID() {
        return ID;
    }

    public void move(int x, int y, int z) {
        this.start.setX(this.start.getX() + x);
        this.start.setY(this.start.getY() + y);
        this.start.setZ(this.start.getZ() + z);

        this.end.setX(this.end.getX() + x);
        this.end.setY(this.end.getY() + y);
        this.end.setZ(this.end.getZ() + z);
    }

    public Line(Point s, Point e, String id) {
        this.ID = id;
        this.start = s;
        this.end = e;
    }

    public String toString() {
        return String.format("%s: Start: %o,%o,%o End: %o,%o,%o", ID,
                start.getX(), start.getY(), start.getZ(),
                end.getX(), end.getY(), end.getZ());
    }

}
