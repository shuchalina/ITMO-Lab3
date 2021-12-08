public enum Form {

    ROUND("круглая"),
    SQUARE("квадратная"),
    TRIANGULAR("треугольная");

    private final String translation;

    Form(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }

}
