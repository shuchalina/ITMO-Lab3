public class Pit {

    private Size size;
    private Form form;

    public Pit(Size size, Form form) {
        this.size = size;
        this.form = form;
        System.out.println(String.format("Создан объект: %s.\n", this.getPit()));
    }

    public Size getSize() {
        return this.size;
    }

    public Form getForm() {
        return this.form;
    }

    public String getPit() {
        return String.format("%s %s яма", this.size.getTranslation(), this.form.getTranslation());
    }

    @Override
    public String toString(){
        return String.format("Объект типа: Pit. Имя: Яма. Размер: %s. Форма: %s.", this.getSize(), this.getForm());
    }

    @Override
    public int hashCode(){
        return 100 * this.hashCode() + 10;
    }

    @Override
    public boolean equals(Object obj1) {
        if (!(obj1 instanceof Pit)) return false;

        Pit obj2 = (Pit) obj1;
        return (obj2.getSize() == this.getSize());
    }

}
