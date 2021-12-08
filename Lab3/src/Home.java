public class Home extends Location {

    public Home(String name) {
        super(name);
        System.out.println(String.format("Создана локация: %s.\n", this.getName()));
    }

    public void description() {
            System.out.println("Мой дом - моя крепость!");
        }

    @Override
    public String toString(){
        return String.format("Объект типа: Home. Имя: %s.", this.getName());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 6;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Home)) return false;

        Home obj2 = (Home) obj1;
        return (obj2.getName() == this.getName());
    }

}
