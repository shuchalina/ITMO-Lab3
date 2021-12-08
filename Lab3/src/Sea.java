public class Sea extends Location {

    public Sea(String name) {
        super(name);
        System.out.println(String.format("Создана локация: %s.\n", this.getName()));
    }

    @Override
    public void description() {
        System.out.println(String.format("Откуда этот шум? это же %s.", this.getName()));
    }

    @Override
    public String toString(){
        return String.format("Объект типа: Sea. Имя: %s.", this.getName());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 7;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Sea)) return false;

        Sea obj2 = (Sea) obj1;
        return (obj2.getName() == this.getName());
    }

}
