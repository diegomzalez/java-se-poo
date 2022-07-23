import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;
    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+this.speciality+"\nAvailable "+ this.availableAppointments.toString();
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
            return this.date;
        }

        public String getTime() {
            return this.time;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " +date+"\nTime: "+time;
        }
    }

    @Override
    public void greet() {
        System.out.println("Hello, I'm a Doctor!");
    }
}
