// Arv - denna klass ärver variabler och metoder från Plant
public class Carnivorous extends Plant {

    public Carnivorous(String name, double height, PlantType plantType) {
        super(name, height, plantType); // Arv - anropar konstruktor från Plant
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public double calculateLiquidAmount() {
        return (0.2 * getHeight()) + 0.1;  // Arv - metoden getHeight ärvs från Plant
    }
}
