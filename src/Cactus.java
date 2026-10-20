// Arv - denna klass ärver variabler och metoder från Plant
public class Cactus extends Plant {

    private static final double BASE_FACTOR = 0.02;

    public Cactus(String name, double height, PlantType plantType) {
        super(name, height, plantType);  // Arv - anropar konstruktor från Plant
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    @Override
    public double calculateLiquidAmount() {
        return BASE_FACTOR;
    }
}
