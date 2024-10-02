package PlantHotel4;

public enum DrinkTypes {
    TAPWATER("tapwater"),
    PROTEINDRINK("protein drink"),
    MINERALWATER("mineral water"),;

    final String typeName;
    DrinkTypes(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
