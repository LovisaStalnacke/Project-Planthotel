import java.util.Map;
import java.util.TreeMap;

public class HotelGuests {

    // Polymorfism
    public static Map<String, Plant> plantList = new TreeMap<>();

    public static void hotelGuests() {
        plantList.put("Igge", new Cactus("Igge", 0.2, PlantType.CACTUS));
        plantList.put("Laura", new Palm("Laura", 5, PlantType.PALM));
        plantList.put("Meatloaf", new Carnivorous("Meatloaf", 0.7, PlantType.CARNIVOROUS));
        plantList.put("Olof", new Palm("Olof", 1, PlantType.PALM));
    }


}
