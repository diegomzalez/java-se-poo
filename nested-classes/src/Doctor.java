import java.util.Date;
import java.util.ArrayList;

public class Doctor {
    // Attributes
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    Doctor(String name, String speciality, String email) {
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        id++;
    }

    // Methods
    public void getName() {
        System.out.println("Patient name: " + this.name);
        return;
    }

    public void getEmail() {
        System.out.println("Patient name: " + this.email);
        return;
    }

    public void getId() {
        System.out.println("ID Doctor: " + id);
    }

    public String getSpeciality() {
        return speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public void printAvailableAppointments() {
        for (AvailableAppointment appointment : availableAppointments) {
            System.out.println(appointment.getDate() + " " + appointment.getTime());
        }
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public int getId() {
            return id;
        }
    }
}
