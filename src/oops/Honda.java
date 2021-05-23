package oops;

public class Honda extends Car{
    int rating;

    public Honda() {
        System.out.println("Honda constructor added");
    }

    public Honda(String color) {
        super(color);
    }

    public Honda(int rating) {
    }

// overloading error
//    public int calcRating(int rating) {
//
//    }
//
//    public double calcRating(int rating) {
//
//    }

    @Override
    public void drive() { // assigning anything other than public gives exception,
        System.out.println("DOg driing");
        super.drive();
    }
}
