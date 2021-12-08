public enum Size {

    SMALL("маленькая"),
    AVERAGE("средняя"),
    BIG("большая"),
    HUGE("огромная");

    private final String translation;

    Size(String translation) {
        this.translation = translation;
    }

    public String getTranslation() { return translation; }

}