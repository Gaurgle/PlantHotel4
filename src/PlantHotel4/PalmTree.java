package PlantHotel4;

public class PalmTree extends Plant{
    private String gender;

    public PalmTree(String name, double height, boolean isFemale){
        super(name, height, isFemale, PlantTypes.PALM);
        setGender(isFemale);
    }

    @Override
    public void setGender(boolean isFemale){
        if (isFemale){
            this.gender = "female";
        } else {
            this.gender = "male";
        }
    }

    @Override
    public String getGender() {
        return this.gender;
    }
    
    @Override
    public String getDrinkFormula() {
        String pronoun = getPronoun();
        String verb = getVerb();

        return
            this.getName()
            +" is a " + PlantTypes.PALM.getTypeName() +" and is " + this.getHeight() +
            " meters tall.\n" + pronoun +verb +(PlantTypes.PALM.getAmount() * getHeight()) +
            " liters of " +DrinkTypes.TAPWATER.getTypeName() +" every day.";
    }

}
