// Arv
public class Carnivorous extends Plant {

    private static final double BASE_FACTOR = 0.1;
    private static final double FACTOR_PER_METER = 0.2;

    public Carnivorous(String name, double height, PlantType plantType) {
        super(name, height, plantType); // Arv
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public double calculateLiquidAmount() {
        return (FACTOR_PER_METER * getHeight()) + BASE_FACTOR;  // Arv
    }
}
