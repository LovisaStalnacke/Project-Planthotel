public enum LiquidType {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String text;

    LiquidType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
