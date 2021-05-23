package oops;

public class Base {

    public Base() {
        System.out.println("Constructor Base");
    }

    static {
        System.out.println("Static block Base");
    }

    public void testInstance() {
        System.out.println("testing instance functioon");
    }

    public static void testStatic() {
        System.out.println("testing static function");

//        testInstance();

//        Base base = new Base();
//        base.testInstance();
    }


    public static void main(String[] args) {
//        Car car = new Car();
//        car.getModel();

//        Honda honda = new Honda();
//        honda.drive();
//        honda.rotate();
//
//        honda.protectedDrive();
//        honda.privateDrive();

//        HondaAmaze hondaAmaze = new HondaAmaze();
//        hondaAmaze.drive();

        IEngine engine;
        engine = new PetrolEngine();
        engine = new DieselEngine();


    }
}
