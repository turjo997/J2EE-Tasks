package Bridge1;

public class User {

    public static void main(String[] args) {

        Produce p = new Produce();
        Assemble a = new Assemble();

        Automobile bus = new Bus(p,a);

        bus.manufacture();

        Automobile taxi = new Taxi(p,a);

        System.out.println();
        taxi.manufacture();
    }
}
