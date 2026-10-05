public class Cactus extends Plant{

    public Cactus(String name, double height) {
        super(name, height);
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

}
