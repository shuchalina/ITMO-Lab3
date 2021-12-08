public class Head {

    private Heroes host; // хозяин головы

    public Head(Heroes host) {
        this.host = host;
        System.out.println(String.format("Создан объект: Голова. Хозяин: %s.\n", host.getName()));
    }

    public Heroes getHost() {
        return this.host;
    }

    public void shake(int count) {

        int sum = 0;

        for (int i = 0; i < count; i ++) {

            sum += 1;
            if (sum < 3) System.out.println(String.format("%s потряс головой.", this.getHost().getName()));
            else {
                System.out.println(String.format("У %s закружилась голова.\n", this.getHost().getName()));
                sum = 0;
            }

        }

        if (count % 3 != 0) System.out.println();

    }

    @Override
    public String toString(){
        return String.format("Объект типа: Hand. Название: Голова. Хозяин: %s.", this.getHost().getName());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 4;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Head)) return false;

        Head obj2 = (Head) obj1;
        return (obj2.getHost() == this.getHost());
    }

}
