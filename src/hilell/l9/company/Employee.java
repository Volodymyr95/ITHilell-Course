package hilell.l9.company;

public class Employee extends Person {

    public long id;
    public double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, long id, double salary) {
        super(firstName, lastName, age);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void getInfo() {
        System.out.println("Employee");
    }
}
