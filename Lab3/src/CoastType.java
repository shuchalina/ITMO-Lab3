public enum CoastType {

    SANDY("Песчаный"),
    PEBBLE("Галечный"),
    ROCKY("Скалистый");

    private final String translation;

    CoastType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }

}
