class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("ID: " + patientID + ", Name: " + name + 
                               ", Age: " + age + ", Ailment: " + ailment + 
                               ", Hospital: " + hospitalName);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Ramesh", 40, "Fever");
        Patient p2 = new Patient(102, "Geeta", 28, "Fracture");

        p1.displayPatient();
        p2.displayPatient();

        Patient.getTotalPatients();
    }
}
