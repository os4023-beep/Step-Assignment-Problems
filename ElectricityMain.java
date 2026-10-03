abstract class Room {
    int units;

    Room(int u) {
        units = u;
    }

    abstract double bill();
    abstract String type();
}

class Single extends Room {
    Single(int u) {
        super(u);
    }

    double bill() {
        return units * 8;
    }

    String type() {
        return "SINGLE";
    }
}

class Shared extends Room {
    int occupants;

    Shared(int u, int o) {
        super(u);
        occupants = o;
    }

    double bill() {
        return units * 6.0 / occupants;
    }

    String type() {
        return "SHARED";
    }
}

class AC extends Room {
    AC(int u) {
        super(u);
    }

    double bill() {
        return units * 10 + 200;
    }

    String type() {
        return "AC";
    }
}

public class ElectricityMain {
    public static void main(String[] args) {

        Room[] r = {
            new Single(120),
            new Shared(150, 3),
            new AC(100)
        };

        double total = 0;

        for (Room x : r) {
            double b = x.bill();
            System.out.printf("%s: %.2f%n", x.type(), b);
            total += b;
        }

        System.out.printf("Total: %.2f", total);
    }
}