package flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower {
    private FlowerColor color;
    private FlowerType type;
    private double sepalLength;
    private double price;

    public String getColor() {
        return color.toString();
    }
}
