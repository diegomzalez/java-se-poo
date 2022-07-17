import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor said = new Doctor("Said Vargas", "Traumatology", "said@gmail.com");
        said.addAvailableAppointment(new Date(), "10pm");
        said.printAvailableAppointments();
    }
}
