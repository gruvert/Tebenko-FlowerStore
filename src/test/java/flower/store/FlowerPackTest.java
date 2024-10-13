package flower.store;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {

    @Test
    public void testFlowerPackPrice() {
        Flower rose = new Flower(FlowerType.ROSE, 7.5, FlowerColor.RED, 15.0);
        FlowerPack pack = new FlowerPack(rose, 5);
        Assertions.assertEquals(75, pack.getPrice());  // 10 * 5
    }
}
