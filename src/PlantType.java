public enum PlantType {

    PALM("Palm"),
    CACTUS("Kaktus"),
    CARNIVOROUS("Köttätande växt");
    private final String text;  // Inkapsling - variabeln är oföränderlig

    PlantType(String text) {
        this.text = text;
    }

    // Inkapsling
    @Override
    public String toString() {
        return this.text;
    }

}
