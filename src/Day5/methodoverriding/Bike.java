package Day5.methodoverriding;

public class Bike extends Vehicle {

    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.run();

    }
}
