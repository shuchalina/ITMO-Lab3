public class Snork extends Heroes {

    public Snork(String name, Location location) {
        super(name, location);
        System.out.println(String.format("Создан персонаж: %s.\n", this.getName()));
    }

    public void findPit(Pit pit) {
        System.out.println(String.format("%s нашёл: %s.\n", this.getName(), pit.getPit()));
    }

    @Override
    public void changeLocation(Location location) {

        System.out.println(String.format("%s отправляется из '%s' в '%s'.\n", this.getName(), this.getLocation().getName(), location.getName()));
        this.setLocation(location);

    }

    @Override
    public String toString(){
        return String.format("Объект типа: Snork. Имя: %s. Локация: %s.", this.getName(), this.getLocation());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 11;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Snork)) return false;

        Snork obj2 = (Snork) obj1;
        return (obj2.getName() == this.getName());
    }

}
