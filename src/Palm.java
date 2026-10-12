public class Palm extends Plant{

    public Palm(String name, double height, PlantType plantType) {
        super(name, height, plantType);
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    @Override
    public double calculateLiquidAmount() {
        return 0.5 * height;      // liter per dag
    }

}
