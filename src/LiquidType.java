public enum LiquidType {

    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");
    private final String text;  // Inkapsling - variabeln är oföränderlig

    LiquidType(String text) {
        this.text = text;
    }

    // Inkapsling
    @Override
    public String toString() {
        return this.text;
    }
}
