import java.util.Scanner;

public class PlantService {

    public static void findPlant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken växt ska vattnas?");
        String response = scan.nextLine().trim();

        Plant foundPlant = null;

        for (Plant plant : HotelGuests.plantList.values()) {
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



}
