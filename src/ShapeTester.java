public class ShapeTester {

    public static void main(String[] args) {
        Shape[] s = new Shape[4];
        s[0] = new Point(1,1,1, "Point1");
        s[1] = new Line(new Point(1,2,3, "PointParam1"), new Point(3,4,5, "PointParam2"), "Line1");
        s[2] = new Circle(new Point(1,2,3, "PointParam3"), 2, "Circle1");
        s[3] = new Sphere(new Point(2,2,2, "PointParam4"), 3, "Sphere1");
        System.out.println("Shapes:");
        for (int i = 0; i <  s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\nMove 2,2,2\nShapes:");
        for (int i = 0; i <  s.length; i++) {
            s[i].move(2,2,2);
            System.out.println(s[i]);
        }
        System.out.println("\nDimensions:");
        for (int i = 0; i <  s.length; i++) {
            if (s[i] instanceof OneDimensionalShape) {
                OneDimensionalShape ods = (OneDimensionalShape)s[i];
                System.out.printf("%s length is %f\n",ods,ods.getLength());
            }
            if (s[i] instanceof TwoDimensionalShape) {
                TwoDimensionalShape tds = (TwoDimensionalShape)s[i];
                System.out.printf("%s area is %f\n", tds, tds.getArea());
            }
            if (s[i] instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape tds = (ThreeDimensionalShape)s[i];
                System.out.printf("%s area is %f\n", tds, tds.getArea());
                System.out.printf("%s volume is %f\n", tds, tds.getArea());
            }
        }
    }


}
