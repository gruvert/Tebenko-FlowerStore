package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {

    @Test
    public void testFlowerPackPrice() {
        Flower tulip = new Flower(FlowerType.TULIP,6.5, FlowerColor.RED, 15);
        FlowerPack pack = new FlowerPack(tulip, 10);
        Assertions.assertEquals(150, pack.getPrice());  // 15 * 10
    }

    @Test
    public void testEmptyFlowerPack() {
        Flower rose = new Flower(FlowerType.ROSE,4.5, FlowerColor.RED, 12);
        FlowerPack pack = new FlowerPack(rose, 0);
        Assertions.assertEquals(0, pack.getPrice());  // Price should be zero if quantity is 0
    }

    @Test
    public void testNegativeQuantity() {
        Flower chamomile = new Flower(FlowerType.CHAMOMILE,4.0, FlowerColor.RED, 5);
        FlowerPack pack = new FlowerPack(chamomile, -3);
        Assertions.assertFalse(pack.getQuantity() >= 0, "Quantity should not be negative");
    }

    @Test
    public void testLargeQuantity() {
        Flower tulip = new Flower(FlowerType.TULIP, 6.0, FlowerColor.BLUE, 8);
        FlowerPack pack = new FlowerPack(tulip, 1000);
        Assertions.assertEquals(8000, pack.getPrice());  // 8 * 1000
    }
}
