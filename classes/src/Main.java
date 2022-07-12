public class Main {
    public static void main(String[] args) {
        Hello.helloWorld();
        Doctor maria = new Doctor("Maria");
        maria.showId();
        Doctor said = new Doctor("Said");
        said.showId();
    }
    static class Hello {
        public static void helloWorld() {
            System.out.println("Hello, world!");
            return;
        }
    }
}
