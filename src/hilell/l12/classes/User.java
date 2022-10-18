package hilell.l12.classes;

public class User {

    public String name;


    public void whoAmI() {
        System.out.println("I am a User!");
    }

    public void heartBreaking() {
        new Heart().doAct();
    }

    class Heart {
        void doAct() {
            System.out.println("----------");
        }
    }
}
