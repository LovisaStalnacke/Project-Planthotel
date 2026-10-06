public class Palm extends Plant{

    public Palm(String name, double height) {
        super(name, height);
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    public double calculateLiquidAmount() {
        return 0.5 * height;      // liter per dag
    }

}
