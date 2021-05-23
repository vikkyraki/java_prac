package oops;

public class Car {
    private String color;
    private Integer doors;
    private String model;
    private String engine;

    public Car(String color) {
        System.out.println("Car color constructor");
        this.color = color;
    }

    public Car() {
        System.out.println("Cars constructor");
    }

    protected void drive() {
        System.out.println(" Car Driving");
    }

    public void rotate() {
        System.out.println("rotating car");
    }

    // default access
    void privateDrive() {

    }

    protected void protectedDrive() {}

    public String getModel() {
        return this.model;
        //return this.getModel(); // recursively call, stack overflow exception
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
