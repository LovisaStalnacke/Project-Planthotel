
public class Cactus extends Plant{

    public Cactus(String name, double height, PlantType plantType) {
        super(name, height, plantType);
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    @Override
    public double calculateLiquidAmount() {
        return 0.02;    // liter per dag
    }

}
