import java.util.Scanner;

// en abstrakt klass används här för att objekt skapas av subklasserna
public abstract class Plant implements CalculateLiquidAmount{

    private final String name;
    protected double height;
    private static PlantType plantType;

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        Plant.plantType = plantType;
    }

    public String getName() {
        return this.name;
    }

    public LiquidType getLiquidType() {
        return null;
    }

    public static PlantType getPlantType() {
        return plantType;
    }

    @Override
    public String toString() {
        return "Växten " + getName() + " (" + Plant.getPlantType() + ") ska få " +
                calculateLiquidAmount() + " liter " + getLiquidType();
    }


}
