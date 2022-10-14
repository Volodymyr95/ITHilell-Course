package hilell.l11;

public class MainL11 {

    public static void main(String[] args) {
        Car car = new Audi();


        Person person = new Person("John", "Doe", 42);
        person.setCar(car);


        person.showInfo();

        car = new BMW();
        person.setCar(car);

        person.showInfo();
    }
}
