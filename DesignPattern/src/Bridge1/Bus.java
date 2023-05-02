package Bridge1;

public class Bus extends Automobile{
    protected Bus(Workshop ws1, Workshop ws2) {
        super(ws1, ws2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bus is ");
        workshop1.work();
        workshop2.work();
    }
}
