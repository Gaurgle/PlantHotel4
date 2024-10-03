package PlantHotel4;

public enum PlantTypes {
    CACTI           ("Cactus",              0.02),
    PALM            ("Palm tree",           0.5),
    CARNIVOROUSPLANT("Carnivorous plant",   0.2),
    AZALEA          ("Azalea",              0.2),
    BAMBOO          ("Bamboo",              1.0),
    BEGONIA         ("Begonia",             0.001),
    DAFFODIL        ("Daffodil",            0.04),
    DAISY           ("Daisy",               0.2),
    EUCALYPTUS      ("Eucalyptus",          0.6);
    // +alla växter i världen

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