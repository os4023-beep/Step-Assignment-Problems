import java.time.LocalDate;

abstract class Plan {
    String name;
    LocalDate start;

    Plan(String n, String d) {
        name = n;
        start = LocalDate.parse(d);
    }

    abstract int days();

    void show() {
        System.out.println(name + ": " + start.plusDays(days()));
    }
}

class Basic extends Plan {
    Basic(String n, String d) {
        super(n, d);
    }

    int days() {
        return 30;
    }
}

class Standard extends Plan {
    Standard(String n, String d) {
        super(n, d);
    }

    int days() {
        return 90;
    }
}

class Premium extends Plan {
    Premium(String n, String d) {
        super(n, d);
    }

    int days() {
        return 365;
    }
}

public class StreamingMain {
    public static void main(String[] args) {

        Plan[] p = {
            new Basic("Asha", "2024-01-15"),
            new Standard("Ravi", "2024-02-01"),
            new Premium("Neha", "2024-03-10"),
            new Basic("Kiran", "2024-12-20")
        };

        for (Plan x : p)
            x.show();
    }
}