package hilell.l9.company;

import java.util.Objects;

public class Developer extends Employee {

    public Developer() {
        super("", "", 12, 12, 12000.0);
    }

    public Developer(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public Developer(String firstName, String lastName, int age, long id, double salary, String primaryLanguage) {
        super(firstName, lastName, age, id, salary);
        this.primaryLanguage = primaryLanguage;
    }

    public String primaryLanguage;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(primaryLanguage, developer.primaryLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryLanguage);
    }
}
