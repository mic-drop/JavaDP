package strategyDP;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setTransport(new Plane());
        person.goToSchool();

        person.setTransport(new Car());
        person.goToSchool();
    }
}
