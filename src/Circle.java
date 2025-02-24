public class Circle {
    // The radius of the circle
    private double radius = 1;

    // The number of the objects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius
    public Circle() {
        numberOfObjects++;
    }

    // Construct a circle with a specified radius
    public Circle(double newRadius) {
        // Maksudnya di assign ke objeknya
        this();
        radius = newRadius;
    }

    // Java by default sudah membuat constructor tanpa kita buat terkadang.
    
    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
