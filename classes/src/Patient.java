public class Patient {
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;
    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showInfo() {
        System.out.println(this.name + " " + this.email);
    }
}
