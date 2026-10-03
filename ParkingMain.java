abstract class Vehicle {
    int hours;

    Vehicle(int h) {
        hours = h;
    }

    abstract double charge();
    abstract String type();
}

class Bike extends Vehicle {
    Bike(int h) {
        super(h);
    }

    double charge() {
        return hours * 10;
    }

    String type() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    Car(int h) {
        super(h);
    }

    double charge() {
        return 30 + (hours - 1) * 20;
    }

    String type() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    Truck(int h) {
        super(h);
    }

    double charge() {
        return Math.max(100, hours * 50);
    }

    String type() {
        return "TRUCK";
    }
}

public class ParkingMain {
    public static void main(String[] args) {

        Vehicle[] v = {
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        };

        double total = 0;

        for (Vehicle x : v) {
            double c = x.charge();
            System.out.printf("%s: %.2f%n", x.type(), c);
            total += c;
        }

        System.out.printf("Total: %.2f", total);
    }
}