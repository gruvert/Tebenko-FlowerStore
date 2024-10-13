package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class StoreTest {

    @Test
    public void testSearchByType() {
        Flower rose = new Flower(FlowerType.ROSE, 5.5, FlowerColor.RED, 10);
        Flower chamomile = new Flower(FlowerType.CHAMOMILE,4.0, FlowerColor.RED, 7);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack chamomilePack = new FlowerPack(chamomile, 3);

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addPack(rosePack);

        FlowerBucket bucket2 = new FlowerBucket();
        bucket2.addPack(chamomilePack);

        Store store = new Store();
        store.addBucket(bucket1);
        store.addBucket(bucket2);

        List<FlowerBucket> result = store.search(FlowerType.ROSE);
        Assertions.assertEquals(0, result.size());
        Assertions.assertFalse(result.contains(bucket1));
    }
}
