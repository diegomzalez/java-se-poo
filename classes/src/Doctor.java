import java.util.Scanner;

public class Doctor {
    // Attributes
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    Doctor(String name, String speciality, String email) {
        this.name = name;
        this.speciality = speciality;
        this.email = email;
        id++;
    }

    // Methods
    public void showName() {
        System.out.println("Patient name: " + this.name);
        return;
    }
    public void showEmail() {
        System.out.println("Patient name: " + this.email);
        return;
    }
    public void showId() {
        System.out.println("ID Doctor: " + this.id);
    }
}
