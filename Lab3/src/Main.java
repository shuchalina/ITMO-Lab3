public class Main {

    public static void main(String[] args) {

        Home moomintrollHome = new Home("Дом Муми-тролля");
        Moomintroll moomintroll = new Moomintroll("Муми-тролль", moomintrollHome, new String[]{"---", "---", "---"});

        Head moomintrollHead = new Head(moomintroll);
        moomintrollHead.shake(3);

        Jar bigJar = new Jar(Size.BIG);

        moomintroll.findJar(bigJar);
        moomintroll.checkInventory();

        Home snorkHome = new Home("Дом Снорка");
        Snork snork = new Snork("Снорк", snorkHome);

        Sea sea = new Sea("Море");
        moomintroll.changeLocation(sea);
        snork.changeLocation(sea);

        Coast coast = new Coast("Берег", CoastType.SANDY);
        moomintroll.changeLocation(coast);
        snork.changeLocation(coast);

        Home antLionHome = new Home("Дом Муравьиного льва");
        AntLion antLion = new AntLion("Муравьиный лев", antLionHome);

        antLion.changeLocation(coast);
        antLion.doHoles(5);

        Pit pit = new Pit(Size.BIG, Form.ROUND);
        snork.findPit(pit);

        Hand hand = new Hand(snork);
        hand.wave(Adverb.DESPERATELY);

    }
}

