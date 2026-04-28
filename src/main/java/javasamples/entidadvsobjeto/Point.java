package javasamples.entidadvsobjeto;

public class Point {
    private int positionX;
    private int positionY;

    public Point(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return positionX == other.positionX && positionY == other.positionY;
    }

}

