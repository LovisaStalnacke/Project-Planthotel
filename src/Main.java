
public class Main {

    public static void main(String[] args) {

        HotelGuests.hotelGuests();

        boolean running = true;

        while (running == true) {

            try {
                System.out.println("\n--- VÄXTHOTELLET GREENEST ---");
                System.out.println("Våra gäster just nu är: \n");

                // Polymorfism - loopar igenom alla Plant-objekt och hittar sorten genom getPlantType
                for (Plant plant : HotelGuests.plantList.values()) {
                    System.out.println(plant.getPlantType() + ": " + plant.getName());
                }

                System.out.print("\n");

                running = PlantService.findPlant();

            } catch (NullPointerException e) {
                System.out.println("Ett oväntat fel inträffade, växtdata kunde inte hämtas.");
            }
            }
        }
    }