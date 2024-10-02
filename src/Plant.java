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

        // overloaded constructor för ickebinära plantor
        public Plant(String name, double height, PlantTypes plantType) {
            this.name = name;
            this.height = height;
            this.plantType = plantType;
            this.gender = "non-binary";
        }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }           // behövs ej
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }   // behövs ej
    public PlantTypes getPlantType() {
        return plantType;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }   // behövs ej

    // abstrakt metod
    public abstract String getDrinkFormula();

}
