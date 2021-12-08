public class Moomintroll extends Heroes implements Inventory {

    private String[] stock;

    public Moomintroll(String name, Location location, String[] stock) {
        super(name, location);
        this.stock = stock;
        System.out.println(String.format("Создан персонаж: %s.\n", this.getName()));
    }

    public void findJar(Jar jar) {

        System.out.println(String.format("%s нашёл: %s.", this.getName(), jar.getJar()));
        this.addInInventory(jar);

    }

    public void checkInventory () {
        System.out.println(String.format("Инвентарь %s: %s, %s, %s.\n", this.getName(), stock[0], stock[1], stock[2]));
    }

    public void addInInventory (Jar jar) {

        boolean empty = false;

        for (int i = 0; i <= this.stock.length; i ++) {
            if (this.stock[i] == "---") {
                this.stock[i] = jar.getJar();
                empty = true;
                System.out.println(String.format("%s добавил в инвентарь: %s.\n", this.getName(), jar.getJar()));
                break;
            }
        }

        if (!empty) {
            System.out.println(String.format("Инвентарь %s переполнен.\n", this.getName()));
        }

    }

    @Override
    public void changeLocation(Location location) {

        System.out.println(String.format("%s отправляется из '%s'.", this.getName(), this.getLocation().getName()));

        double chance;
        do {
            chance = Math.random();
            System.out.println(String.format("%s идет... идет... идет...", this.getName()));
        } while (chance <= 0.1);

        System.out.println(String.format("%s пришел в '%s'!\n", this.getName(), location.getName()));
        this.setLocation(location);

    }

    @Override
    public String toString(){
        return String.format("Объект типа: Moomintroll. Имя: %s. Локация: %s.", this.getName(), this.getLocation());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 9;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Moomintroll)) return false;

        Moomintroll obj2 = (Moomintroll) obj1;
        return (obj2.getName() == this.getName());
    }

}
