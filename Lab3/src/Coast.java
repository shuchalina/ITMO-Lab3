public class Coast extends Location {

    CoastType type;

    public Coast (String name, CoastType type) {
        super(name);
        this.type = type;
        System.out.println(String.format("Создана локация: %s %s.\n", this.type.getTranslation(), this.getName()));
    }

    public CoastType getType() {
        return this.type;
    }

    @Override
    public void description() {
        System.out.println("Этот берег просто чудо!");
    }

    @Override
    public String toString(){
        return String.format("Объект типа: Coast. Имя: %s. Тип: %s.", this.getName(), this.getType().getTranslation());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 2;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Coast)) return false;

        Coast obj2 = (Coast) obj1;
        return (obj2.getType() == this.getType());
    }

}
