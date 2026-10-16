import java.util.Scanner;

// abstract klass för att den definierar vad Plant är
// en abstrakt klass används här för att objekt skapas av subklasserna, inte denna parent-klass och så den inte behöver ha metoden från interfacet
// implementerar ett Interface för att subklasserna måste ha metoden calculateLiquidAmount()
// subklasserna behöver inte "implements" för att de ärver detta redan, det blir redundant
public abstract class Plant implements CalculateLiquidAmount{

    private final String name;
    private double height;
    private PlantType plantType;

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    // inkapsling genom getters
    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return height;
    }

    // abstrakt metod som är gemensam för alla subklasser men som inte används av denna parent-klass
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
