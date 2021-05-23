package oops;

public class PetrolEngine implements IEngine{
    private int mileage;

    PetrolEngine() {
        System.out.println("Petrol ENgine constructor");
    }

    PetrolEngine(int mileage) {
        System.out.println("Petrol ENgine constructor");
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void drive() {

    }
}
