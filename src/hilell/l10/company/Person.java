package hilell.l10.company;

public class Person {

    public static int number;
    public String firstName;
    public String lastName;
    public int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void test() {
        info();
    }

    public static void info() {

        System.out.println();
    }
}
