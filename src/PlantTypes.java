public enum PlantTypes {
    CACTI("Cactus", 0.02),
    PALM("Palm tree", 0.5),
    CARNIVOROUSPLANT("Carnivorous plant", 0.2);

    final String typeName;
    final double amount;
    PlantTypes(String typeName, double amount) {
        this.typeName = typeName;
        this.amount = amount;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getAmount() {
        return amount;
    }
}
