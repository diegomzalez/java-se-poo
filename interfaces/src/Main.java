import model.Doctor;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("model.User", "UserXD");
        Doctor said = new Doctor("Said Vargas", "stephany@");
        Patient diego = new Patient("Diego", "diegoXD");
        System.out.println(user+"\n"+said+"\n"+diego);
    }
}
