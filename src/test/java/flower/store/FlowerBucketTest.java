package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {

    @Test
    public void testFlowerBucketPrice() {
        Flower rose = new Flower(FlowerType.ROSE,5.5, FlowerColor.RED, 10);
        Flower tulip = new Flower(FlowerType.TULIP, 4.5, FlowerColor.BLUE, 15);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack tulipPack = new FlowerPack(tulip, 3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addPack(rosePack);
        bucket.addPack(tulipPack);

        Assertions.assertEquals(95, bucket.getPrice());  // (10 * 5) + (15 * 3)
    }
}
