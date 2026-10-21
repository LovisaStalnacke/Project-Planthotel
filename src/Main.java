
public class Main {

    public static void main(String[] args) {

        HotelGuests.hotelGuests();

        boolean running = true;

        while (running) {

            try {
                System.out.println("\n--- VÄXTHOTELLET GREENEST ---");
                System.out.println("Våra gäster just nu är: \n");

                // Polymorfism
                for (Plant plant : HotelGuests.plantList.values()) {
                    System.out.println(plant.getPlantType() + ": " + plant.getName());
                }

                System.out.print("\n");

                running = PlantService.findPlant();

            } catch (IllegalArgumentException e) {
                System.out.println("Fel: " + e.getMessage());
            }
            }
        }
    }