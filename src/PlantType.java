public enum PlantType {

    PALM("Palm"),
    CACTUS("Kaktus"),
    CARNIVOROUS("Köttätande växt");
    private final String text;

    PlantType(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return this.text;
    }

}
