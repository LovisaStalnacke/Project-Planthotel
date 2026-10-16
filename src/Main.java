
public class Main {

    public static void main(String[] args) {

        HotelGuests.hotelGuests();

        boolean running = true;

        while (running == true) {

            System.out.println("\n--- VÄXTHOTELLET GREENEST ---");
            System.out.println("Våra gäster just nu är: \n");

            for (Plant plant : HotelGuests.plantList.values()){
                System.out.println(plant.getPlantType() + ": " + plant.getName());
            }

            System.out.print("\n");

            running = PlantService.findPlant();

        }
    }
}
