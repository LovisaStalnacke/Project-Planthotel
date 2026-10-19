
/*En abstrakt klass - objekt skapas endast av subklasserna, inte denna parent-klass för den
behöver inte ha metoden från interfacet.
Klassen implementerar ett Interface för att subklasserna måste ha metoden calculateLiquidAmount().
Subklasserna behöver inte "implements" för att de ärver detta redan. */

public abstract class Plant implements CalculateLiquidAmount{

    /* Inkapsling - privata instansvariabler som inte kan ändras av andra klasser
    och kan bara blir tillgängliga genom getters. */
    private final String name;
    private double height;
    private final PlantType plantType;   // Inkapsling - variabeln är oföränderlig pga 'final'

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    // Inkapsling genom getters
    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return height;
    }

    // Abstrakt metod som är gemensam för alla subklasser men som inte används av denna parent-klass
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
