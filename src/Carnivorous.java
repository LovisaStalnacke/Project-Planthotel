public class Carnivorous extends Plant{

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    public static LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    public static double calculateLiquidAmount() {
        return (0.2 * height) + 0.1;   // liter per dag
    }

}
