public class Cactus extends Plant {

    public Cactus(String name, double height, PlantType plantType) {
        super(name, height, plantType);
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    // polymorfism: metoden finns i parent-klassen men overrides här med ett annat retur-värde
    @Override
    public double calculateLiquidAmount() {
        return 0.02;
    }
}
