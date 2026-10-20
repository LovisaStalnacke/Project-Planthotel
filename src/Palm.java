// Arv - denna klass ärver variabler och metoder från Plant
public class Palm extends Plant {

    private static final double BASE_FACTOR = 0.5;

    public Palm(String name, double height, PlantType plantType) {
        super(name, height, plantType); // Arv - anropar konstruktor från Plant
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    @Override
    public double calculateLiquidAmount() {
        return BASE_FACTOR * getHeight();  // Arv - metoden getHeight ärvs från Plant
    }
}
