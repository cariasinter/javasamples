package javasamples.entidadvsobjeto;

public class DemoPoint {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        Point point3 = point1;
        
        System.out.println("point1 equals point2? " + point1.equals(point2));
        System.out.println("point1 == point2? " + (point1 == point2));
        System.out.println("point1 == point3? " + (point1 == point3));

    }
}
