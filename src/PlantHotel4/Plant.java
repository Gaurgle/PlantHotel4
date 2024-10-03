package PlantHotel4;

public abstract class Plant implements IsetGender{
    private String name;
    private double height;
    private String gender;
    private PlantTypes plantType;

    public Plant(String name, double height, boolean isFemale, PlantTypes plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
        setGender(isFemale);
    }

    // overloaded constructor för icke-binära plantor
    public Plant(String name, double height, PlantTypes plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
        this.gender = "non-binary";
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public PlantTypes getPlantType() {
        return plantType;
    }
    public void setName(String name) {
        this.name = name;
    }           // behövs ej
    public void setHeight(double height) {
        this.height = height;
    }   // behövs ej

    @Override
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }   // behövs ej

    // abstrakt metod, polymorfism.
    public abstract String getDrinkFormula();

}
