// Arv
public class Palm extends Plant {

    private static final double BASE_FACTOR = 0.5;

    public Palm(String name, double height, PlantType plantType) {
        super(name, height, plantType); // Arv
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    @Override
    public double calculateLiquidAmount() {
        return BASE_FACTOR * getHeight();  // Arv
    }
}
