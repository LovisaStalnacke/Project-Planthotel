public class Carnivorous extends Plant{

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

}
