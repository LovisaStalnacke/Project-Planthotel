import java.util.Scanner;

public class Plant {

    private String name;
    protected double height;
    private PlantType plantType;

    public Plant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public LiquidType getLiquidType() {
        return null;
    }

    public double calculateLiquidAmount() {
        return 0.0;
    }

    @Override
    public String toString() {
        // this.calculateLiquidAmount() kommer automatiskt att köra underklassens formel
        return "Växten " + getName() + " (" + plantType + ") ska få " +
                this.calculateLiquidAmount() + " liter " + this.getLiquidType();
    }

    public static void findPlant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken växt ska vattnas?");
        String response = scan.nextLine().trim();

        Plant foundPlant = null;

        for (Plant plant : Main.plantList.values()) {
            // Här jämförs växtens namn med användarens svar oavsett stora/små bokstäver
            if (plant.getName().equalsIgnoreCase(response)) {
                foundPlant = plant;
                break;
            }
        }
        if (foundPlant != null) {
            System.out.println(foundPlant);
        } else {
            System.out.println("Ingen växt med det namnet hittades");
        }
    }


    public PlantType getPlantType() {
        return plantType;
    }

}
