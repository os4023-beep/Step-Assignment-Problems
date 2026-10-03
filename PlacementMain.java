class PlacementRecord {
    String studentName, company;
    double packageLpa;

    PlacementRecord(String n, String c, double p) {
        studentName = n;
        company = c;
        packageLpa = p;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class PlacementMain {
    public static void main(String[] args) {
        PlacementRecord[] p = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        for (PlacementRecord x : p)
            x.printRecord();
    }
}