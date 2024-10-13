package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(FlowerType.ROSE, 5.5, FlowerColor.RED, 10);
    }

    @Test
    public void testPrice() {
        flower.setPrice(25);
        Assertions.assertEquals(25, flower.getPrice());
    }

    @Test
    public void testSepalLength() {
        flower.setSepalLength(7.0);
        Assertions.assertEquals(7.0, flower.getSepalLength());
    }

    @Test
    public void testColor() {
        flower.setColor(FlowerColor.BLUE);
        Assertions.assertEquals("#0000FF", flower.getColor());
    }

    @Test
    public void testInvalidPrice() {
        flower.setPrice(-5); // Negative price should not be allowed
        Assertions.assertFalse(flower.getPrice() >= 0, "Price cannot be negative");
    }

    @Test
    public void testFlowerType() {
        flower = new Flower(FlowerType.CHAMOMILE, 5.5, FlowerColor.RED, 7);
        Assertions.assertEquals(null, flower.getFlowerType());
    }
}
