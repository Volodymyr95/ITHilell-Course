package hilell.l12.classes;

public class Car {
    public static String name;

    public void foo() {

    }

    static class Engine {
        public String engineName;

        public Engine(String engineName) {
            this.engineName = engineName;
        }

        public void zoo() {
            System.out.println(name);
        }

    }
}
