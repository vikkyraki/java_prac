package oops;

public class DieselEngine implements IEngine{

    private int mileage;

    DieselEngine() {
        System.out.println("Diesel ENgine constructor");
    }

    DieselEngine(int mileage) {
        System.out.println("Diesel ENgine constructor");
    }


    @Override
    public void powerOn() {

    }

    @Override
    public void drive() {

    }
}
