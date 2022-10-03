package hilell.l9.company;

public class CompanyMain {
    public static void main(String[] args) {

        Developer developer = new Developer("Java");
        Developer developer2 = developer;


        System.out.println(developer == developer2);


    }
}
