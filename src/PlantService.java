import java.util.Scanner;

public class PlantService {

    private static final Scanner scan = new Scanner(System.in);

    public static boolean findPlant() {

        System.out.println("Vilken växt ska vattnas? \n(Skriv 'avsluta' för att stänga programmet)");
        String response = scan.nextLine().trim();

        if (response.equalsIgnoreCase("avsluta")) {
            System.out.println("Växthotellet stängs för idag, hejdå!");
            return false;
        }

        if (response.isEmpty()) {
            throw new IllegalArgumentException("Du måste skriva namnet på växten, försök igen!");
        }

        Plant foundPlant = null;

        /* Polymorfism - loopar igenom Plant-objekt men tittar på varje objekt och ser vilken subklass
        de tillhör och kör calculateLiquidAmount för just den växten */
        for (Plant plant : HotelGuests.plantList.values()) {
            if (plant.getName().equalsIgnoreCase(response)) {
                foundPlant = plant;
                break;
            }
        }
        if (foundPlant != null) {
            System.out.println(foundPlant);
        } else {
            throw new IllegalArgumentException("Ingen växt med namnet '" + response + "' hittades, kontrollera stavningen!");
        }
        return true;
    }

}
