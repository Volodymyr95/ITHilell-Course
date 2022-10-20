package hilell.l13;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    public User(String firstName, Gender gender) {
        this.firstName = firstName;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "User{" +
            "firstName='" + firstName + '\'' +

            ", gender=" + gender +
            '}';
    }
}
