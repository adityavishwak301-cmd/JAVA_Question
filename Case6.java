class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    void checkTemperature() {

        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        }
        else {
            System.out.println("Status: Normal");
        }
    }

    void displayPatient() {

        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°F");

        checkTemperature();
    }
}

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient();

        patient.patientId = 101;
        patient.name = "Aditya";
        patient.age = 20;
        patient.temperature = 101.2;

        patient.displayPatient();
    }
}
