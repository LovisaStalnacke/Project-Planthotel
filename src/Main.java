import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // skapar en HashMap
    public static Map<String, Plant> plantList = new HashMap<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        // objekt skapas och läggs till i en samling
        plantList.put("Igge", new Cactus("Igge", 0.2));
        plantList.put("Laura", new Palm("Laura", 5));
        plantList.put("Meatloaf", new Carnivorous("Meatloaf", 0.7));
        plantList.put("Olof", new Palm("Olof", 1));


        // meny
        boolean running = true;

        while (running == true) {

            System.out.println("\n--- VÄXTHOTELLET GREENEST ---");

            Plant.findPlant();




          /*  if (plantChoice.equalsIgnoreCase("Igge")) {
                System.out.format(new Locale("sv", "SE"), "Kaktusen %s ska få %.2f liter %s%n",
                        igge.getName(), igge.calculateLiquidAmount(), igge.getLiquidType());
            } else if (plantChoice.equalsIgnoreCase("Laura")) {
                System.out.format(new Locale("sv", "SE"), "Palmen %s ska få %.2f liter %s%n",
                        laura.getName(), laura.calculateLiquidAmount(), laura.getLiquidType());
            } else if (plantChoice.equalsIgnoreCase("Meatloaf")) {
                System.out.format(new Locale("sv", "SE"), "Köttätande växten %s ska få %.2f liter %s%n",
                        meatloaf.getName(), meatloaf.calculateLiquidAmount(), meatloaf.getLiquidType());
            } else if (plantChoice.equalsIgnoreCase("Olof")) {
                System.out.format(new Locale("sv", "SE"), "Palmen %s ska få %.2f liter %s%n",
                        olof.getName(), olof.calculateLiquidAmount(), olof.getLiquidType());
            } else {
                System.out.println("Fel inmatning! Vänligen skriv namnet på växten");
            }*/




        }


    }

}
