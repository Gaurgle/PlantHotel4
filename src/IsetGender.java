public interface IsetGender {
    void setGender(boolean isFemale);
    String getGender();

    default String getPronoun() {
        String gender = getGender().toLowerCase();
        return switch (gender) {
            case "female" -> "She";
            case "male" -> "He";
            default -> "They";
        };
    }

    default String getVerb() {
        String pronoun = getPronoun();
        return pronoun.equals("They") ? " need " : " needs ";
    }
}
