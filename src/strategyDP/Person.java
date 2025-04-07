package strategyDP;

public class Person {

    Transport transport;

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void goToSchool(){
        System.out.println("Person went to school by " + transport.getName());
    }
}
