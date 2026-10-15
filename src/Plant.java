import java.util.Scanner;

// en abstrakt klass används här för att objekt skapas av subklasserna
public abstract class Plant implements CalculateLiquidAmount{

    private final String name;
    protected double height;
    private PlantType plantType;

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    public String getName() {
        return this.name;
    }

    public LiquidType getLiquidType() {
        return null;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    @Override
    public String toString() {
        return "Växten " + getName() + " (" + getPlantType() + ") ska få " +
                calculateLiquidAmount() + " liter " + getLiquidType();
    }


}
