package hilell.l12.task;

public class FEDeveloper extends Developer {


    public FEDeveloper(String firstName, String lastName, int age, int salary, int countOfExcperience) {
        super(firstName, lastName, age, salary, countOfExcperience);
    }

    @Override
    public void doJob() {
        System.out.println("DO FE");
    }

    @Override
    public void doResult() {
        System.out.println("FE Done!");
    }
}
