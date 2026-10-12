import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // skapar en HashMap
    public static Map<String, Plant> plantList = new HashMap<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // objekt skapas och läggs till i en samling
        plantList.put("Igge", new Cactus("Igge", 0.2, PlantType.CACTUS));
        plantList.put("Laura", new Palm("Laura", 5, PlantType.PALM));
        plantList.put("Meatloaf", new Carnivorous("Meatloaf", 0.7, PlantType.CARNIVOROUS));
        plantList.put("Olof", new Palm("Olof", 1, PlantType.PALM));


        // meny
        boolean running = true;

        while (running == true) {

            System.out.println("\n--- VÄXTHOTELLET GREENEST ---");
            System.out.println("Våra gäster just nu är: \n");

            // skriver ut växttypen och namnet på växten
            for (Plant plant : plantList.values()){
                System.out.println(plant.getPlantType() + ": " + plant.getName());
            }

            System.out.print("\n");

            Plant.findPlant();

        }
    }
}
