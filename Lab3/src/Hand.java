public class Hand {

    private Heroes host; // хозяин головы

    public Hand(Heroes host) {
        this.host = host;
        System.out.println(String.format("Создан объект: Рука. Хозяин: %s.\n", host.getName()));
    }

    public Heroes getHost() {
        return this.host;
    }

    public void wave(Adverb adverb) {
        System.out.println(String.format("%s %s замахал рукой.\n", this.getHost().getName(), adverb.getTranslation()));
    }

    @Override
    public String toString(){
        return String.format("Объект типа: Hand. Название: Рука. Хозяин: %s.", this.getHost().getName());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 3;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Hand)) return false;

        Hand obj2 = (Hand) obj1;
        return (obj2.getHost() == this.getHost());
    }

}
