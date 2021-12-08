public class Jar {

    private Size size;

    public Jar(Size size) {
        this.size = size;
        System.out.println(String.format("Создан объект: %s банка.\n", this.size.getTranslation()));
    }

    private Size getSize() {
        return this.size;
    }

    public String getJar() {
        return this.size.getTranslation() + " банка";
    }

    @Override
    public String toString(){
        return String.format("Объект типа: Jar. Название: банка. Размер: %s.", this.getSize());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 8;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Jar)) return false;

        Jar obj2 = (Jar) obj1;
        return (obj2.getSize() == this.getSize());
    }

}
