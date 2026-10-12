public class Carnivorous extends Plant{

    public Carnivorous(String name, double height, PlantType plantType) {
        super(name, height, plantType);
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public double calculateLiquidAmount() {
        return (0.2 * height) + 0.1;   // liter per dag
    }

}
