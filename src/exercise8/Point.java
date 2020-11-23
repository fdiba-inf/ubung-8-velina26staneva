package exercise8;

public class Point {
    private double x;
    private double y;

    public Point() {
      x = 0;
      y = 0;
    }

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Point(Point otherPoint) {
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public void initialize() {
        System.out.println("Geben Sie einen X ein: ");
        x = Utils.INPUT.nextDouble();
        System.out.println("Geben Sie einen Y ein: ");
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;
        Point pointToReturn = new Point (newX, newY);
        return pointToReturn;
    }

    public boolean equals(Point otherPoint) {
        boolean check1 = Utils.equals(x, otherPoint.x);
        boolean check2 = Utils.equals(y, otherPoint.y);
        return check1 && check2;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + "," + y + ")";
    }
}
