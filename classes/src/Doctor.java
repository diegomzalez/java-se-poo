import java.util.Scanner;

public class Doctor {
    // Attributes
    static int id = 0;
    String name;
    String speciality;

    Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        System.out.println("Building a Doctor object");
        id++;
        System.out.println("Doctor name is: " + name);
    }

    // Methods
    public void showName() {
        System.out.println(name);
        return;
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
