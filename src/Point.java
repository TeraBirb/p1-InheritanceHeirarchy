public class Point extends ZeroDimensionalShape {
    String ID;

    int x;
    int y;
    int z;

    public void move(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public String getID() {
        return ID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point(int x, int y, int z, String id) {
        this.ID = id;

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return String.format("%s: %o,%o,%o", ID, getX(), getY(), getZ());
//        return ID;
    }
}
