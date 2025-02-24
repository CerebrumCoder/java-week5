// Hanya 1 public class saja

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
    @Test
    public void getAreaTest1() {
        Circle c1 = new Circle(10);
        assertEquals(314.0, c1.getArea(), 0.2);
        assertEquals(10, c1.getRadius(), 0.2);
    }
}
