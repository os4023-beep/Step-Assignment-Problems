abstract class Customer {
    double amount;

    Customer(double a) {
        amount = a;
    }

    abstract double bill();
    abstract String type();
}

class Student extends Customer {
    Student(double a) {
        super(a);
    }

    double bill() {
        return amount * 0.90;
    }

    String type() {
        return "STUDENT";
    }
}

class Staff extends Customer {
    Staff(double a) {
        super(a);
    }

    double bill() {
        return amount * 0.95;
    }

    String type() {
        return "STAFF";
    }
}

class Guest extends Customer {
    Guest(double a) {
        super(a);
    }

    double bill() {
        return amount + 10;
    }

    String type() {
        return "GUEST";
    }
}

public class CanteenMain {
    public static void main(String[] args) {

        Customer[] c = {
            new Student(200),
            new Staff(300),
            new Guest(150)
        };

        double total = 0;

        for (Customer x : c) {
            double b = x.bill();
            System.out.printf("%s: %.2f%n", x.type(), b);
            total += b;
        }

        System.out.printf("Total: %.2f", total);
    }
}