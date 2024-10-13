package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    // Constructor for Flower
    public Flower(FlowerType flowerType, double sepalLength, FlowerColor color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }
    public Flower(){
        
    }

    public String getColor() {
        return color.toString();
    }
public class Rose extends Flower {
    public Rose(double sepalLength, FlowerColor color, double price) {
        super(FlowerType.ROSE, sepalLength, color, price);
    }
}

public class Chamomile extends Flower {
    public Chamomile(double sepalLength, FlowerColor color, double price) {
        super(FlowerType.CHAMOMILE, sepalLength, color, price);
    }
}

public class Tulip extends Flower {
    public Tulip(double sepalLength, FlowerColor color, double price) {
        super(FlowerType.TULIP, sepalLength, color, price);
    }
}

}
