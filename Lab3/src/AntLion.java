public class AntLion extends Heroes implements DoHoles {

    public AntLion(String name, Location location) {
        super(name, location);
        System.out.println(String.format("Создан персонаж: %s.\n", this.getName()));
    }

    public void doHoles(int count) {

        System.out.println(String.format("%s устраивает норы. Количество нор: %d.", this.getName(), count));

        int sum = 0, a, b, count_ways;
        for (int i = 0; i < count; i ++) sum += i;
        count_ways = (int) (Math.random() * sum + 1);

        System.out.println(String.format("%s соединяет норы. Выкопаны ходы:", this.getName()));

        for (int i = 0; i < count_ways; i ++) {

            a = (int) (Math.random() * (count - 1) + 1);

            do {
                b = (int) (Math.random() * (count - 1) + 1);
            } while (a == b);

            System.out.println(String.format("- от %d-ой норы до %d-ой норы", a, b));
        }

        if (count_ways < 5) {
            System.out.println("Коварные норы не получились.\n");
        }
        else{
            System.out.println("Получились коварные норы!\n");
        }

    }

    @Override
    public void changeLocation(Location location) {

        System.out.println(String.format("%s отправляется из '%s'.", this.getName(), this.getLocation().getName()));

        double chance;
        do {
            chance = Math.random();
            System.out.println(String.format("%s идет... идет... идет...", this.getName()));
        } while (chance <= 0.5);

        System.out.println(String.format("%s пришел в '%s'!\n", this.getName(), location.getName()));
        this.setLocation(location);

    }

    @Override
    public String toString() {
        return String.format("Объект типа: AntLion. Имя: %s. Локация: %s.", this.getName(), this.getLocation());
    }

    @Override
    public int hashCode() {
        return 100 * this.hashCode() + 1;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof AntLion)) return false;

        AntLion obj2 = (AntLion) obj1;
        return (obj2.getName() == this.getName());
    }

}
