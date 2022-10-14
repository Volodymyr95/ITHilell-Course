package hilell.l11.interfaces;

public interface InterfaceA {

    void a();

    default void foo() {
        System.out.println("Hello");
    }
}
