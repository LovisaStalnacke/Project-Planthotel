import java.util.Locale;

public class Cactus extends Plant{

    public Cactus(String name, double height) {
        super(name, height);
    }

    public static LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    public static double calculateLiquidAmount() {
        return 0.02;    // liter per dag
    }

    /*public String printMessage() {
        return super.printMessage() +

        System.out.format(new Locale("sv", "SE"), "Kaktusen %s ska få %.2f liter %s%n",
                igge.getName(), igge.calculateLiquidAmount(), igge.getLiquidType());
    }*/

}
