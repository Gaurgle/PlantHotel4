package PlantHotel4;

public interface IsetGender {
    // polymorfism, alla subklasserna använder interfacet PlantHotel4pkg.IsetGender.

    void setGender(boolean isFemale);
    String getGender();

    // enhanced switch för att sätta pronomen.
    default String getPronoun() {
        String gender = getGender().toLowerCase();
        return switch (gender) {
            case "female" -> "She";
            case "male" -> "He";
            default -> "They";
        };
    }

    // Ternery för att sätta plural
    default String getVerb() {
        String verb = getPronoun();
        return verb.equals("They") ? " need " : " needs ";
    }
}
