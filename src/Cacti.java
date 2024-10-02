public class Cacti extends Plant{
    private String gender;

    public Cacti(String name, double height, boolean isFemale){
        super(name, height, isFemale, PlantTypes.CACTI);
        setGender(isFemale);
    }

    // Ovarloaded constructor for ickebinära kaktusar
    public Cacti(String name, double height){
        super(name, height, PlantTypes.CACTI);
        this.gender = "non-binary";
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
                    +" is a " + PlantTypes.CACTI.getTypeName() +" and is " + this.getHeight() +
                    " meters tall.\n" + pronoun +verb + +PlantTypes.CACTI.getAmount() +
                    " liters of " +DrinkTypes.MINERALWATER.getTypeName() +" every day.";
    }

}
