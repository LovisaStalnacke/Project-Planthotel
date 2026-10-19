public enum PlantType {

    PALM("Palm"),
    CACTUS("Kaktus"),
    CARNIVOROUS("Köttätande växt");
    private final String text;  // Inkapsling - variabeln är oföränderlig

    PlantType(String text) {
        this.text = text;
    }

    /* Inkapsling - istället för en vanligt getter används en Override av toString
    för att skicka ut en kontrollerad text */
    @Override
    public String toString() {
        return this.text;
    }

}
