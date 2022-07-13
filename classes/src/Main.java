public class Main {
    public static void main(String[] args) {
        Doctor said = new Doctor("Said Vargas", "Traumatology", "vargassaid@gmail.com");
        Patient diego = new Patient("Diego", "diegom.gcalovi@gmail.com");
        said.showName();
        diego.showInfo();
    }
}
