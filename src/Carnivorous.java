// Arv - denna klass ärver variabler och metoder från Plant
public class Carnivorous extends Plant {

    private static final double BASE_FACTOR = 0.1;
    private static final double FACTOR_PER_METER = 0.2;

    public Carnivorous(String name, double height, PlantType plantType) {
        super(name, height, plantType); // Arv - anropar konstruktor från Plant
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public double calculateLiquidAmount() {
        return (FACTOR_PER_METER * getHeight()) + BASE_FACTOR;  // Arv - metoden getHeight ärvs från Plant
    }
}
