abstract class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    abstract double bonus();
}

class FullTime extends Employee {
    FullTime(String n, double s) {
        super(n, s);
    }

    double bonus() {
        return salary * 0.10;
    }
}

class PartTime extends Employee {
    PartTime(String n, double s) {
        super(n, s);
    }

    double bonus() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    Intern(String n, double s) {
        super(n, s);
    }

    double bonus() {
        return 2000;
    }
}

public class BonusMain {
    public static void main(String[] args) {

        Employee[] e = {
            new FullTime("Asha", 50000),
            new PartTime("Ravi", 30000),
            new Intern("Neha", 15000)
        };

        double total = 0;

        for (Employee x : e) {
            double b = x.bonus();
            System.out.printf("%s: %.2f%n", x.name, b);
            total += b;
        }

        System.out.printf("Total Bonus: %.2f", total);
    }
}