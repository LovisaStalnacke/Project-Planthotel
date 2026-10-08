import java.util.Scanner;

public class Plant {

    String name;
    static double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }


    public static void findPlant() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken växt ska vattnas?");
        String response = scan.nextLine();

        response = String.valueOf(Main.plantList.get(response));

        if (response != null) {
            System.out.println(response);
        } else {
            System.out.println("Ingen växt med det namnet hittades");
        }



    }



    public String toString() {
        return "Växten " + getName() + " ska få " + Cactus.calculateLiquidAmount() + " liter " + Cactus.getLiquidType();
    }



}
