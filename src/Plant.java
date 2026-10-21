
public abstract class Plant implements CalculateLiquidAmount{

    private final String name;
    private double height;
    private final PlantType plantType;

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    // Inkapsling
    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return height;
    }

    public abstract LiquidType getLiquidType();

    public PlantType getPlantType() {
        return plantType;
    }

    @Override
    public String toString() {
        return "Växten " + getName() + " (" + getPlantType() + ") ska få " +
                calculateLiquidAmount() + " liter " + getLiquidType();
    }


}
