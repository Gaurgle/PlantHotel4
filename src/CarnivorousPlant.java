public class CarnivorousPlant extends Plant {
    private String gender;
    private final double baseAmount;

    public CarnivorousPlant(String name, double height, boolean isFemale) {
        super(name, height, isFemale, PlantTypes.CARNIVOROUSPLANT);
        this.baseAmount = 0.1;
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
                    +" is a " + PlantTypes.CARNIVOROUSPLANT.getTypeName() +" and is " + this.getHeight() +
                    " meters tall.\n" + pronoun +verb +
                    (baseAmount + (PlantTypes.CARNIVOROUSPLANT.getAmount() * getHeight())) +
                    " liters of" +DrinkTypes.PROTEINDRINK.getTypeName() +" every day.";
    }

}
