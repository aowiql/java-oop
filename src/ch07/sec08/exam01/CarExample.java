package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();
        System.out.println();

        myCar.tire = new HankooTire();
        myCar.run();
        System.out.println();

        myCar.tire = new KumhoTire();
        myCar.run();
        System.out.println();
    }
}
