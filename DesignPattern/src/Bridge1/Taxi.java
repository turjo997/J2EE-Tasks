package Bridge1;

public class Taxi extends Automobile{
    protected Taxi(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void manufacture() {
        System.out.print("Taxi is ");
        workshop1.work();
        workshop2.work();
    }
}
