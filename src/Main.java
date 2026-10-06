import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // objekt skapas
        Cactus igge = new Cactus("Igge", 0.2);
        Palm laura = new Palm("Laura", 5);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
        Palm olof = new Palm("Olof", 1);

        // meny

        boolean running = true;

        while (running == true) {

            System.out.println("\n--- VÄXTHOTELLET GREENEST ---");
            System.out.println("Vilken växt ska vattnas?");
            String plantChoice = scan.nextLine();



            if (plantChoice.equalsIgnoreCase("Igge")) {
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
            }




        }


    }

}
