package hilell.l12.task;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int countOfExcperience;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, int salary, int countOfExcperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.countOfExcperience = countOfExcperience;
    }

    public abstract void doJob();

    public abstract void doResult();
}
