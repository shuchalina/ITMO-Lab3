public enum Adverb {

        DESPERATELY("отчаянно"),
        JOYFULLY("радостно"),
        SAD("грустно");

        private final String translation;

        Adverb(String translation) {
            this.translation = translation;
        }

        public String getTranslation() { return translation; }

}