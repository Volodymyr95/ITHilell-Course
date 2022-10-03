package hilell.l9.car;

public class SpaceSuperUkrainianCar extends FlightCar {

    public String typeOfFuel;

    @Override
    public void getCarInfo() {
        super.getCarInfo();
        System.out.println("I am Space car!");
        System.out.println("Car name: " + name);
    }
}
