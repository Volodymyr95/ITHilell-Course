package hilell.l9.company;

public class Tester extends Employee {

    public Tester() {
    }

    public Tester(String firstName, String lastName, int age, long id, double salary, boolean isManual) {
        super(firstName, lastName, age, id, salary);
        this.isManual = isManual;
    }

    public boolean isManual;
}
