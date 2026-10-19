import java.util.Scanner;

public class PlantService {

    public static boolean findPlant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken växt ska vattnas? \n(Skriv 'avsluta' för att stänga programmet)");
        String response = scan.nextLine().trim();

        if (response.equalsIgnoreCase("avsluta")) {
            System.out.println("Växthotellet stängs för idag, hejdå!");
            return false;
        }

        if (response.isEmpty()) {
            System.out.println("Du måste skriva namnet på växten, försök igen!");
            return true;
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
            System.out.println("Ingen växt med namnet '" + response + "' hittades, kontrollera stavningen!");
        }
        return true;
    }

}
