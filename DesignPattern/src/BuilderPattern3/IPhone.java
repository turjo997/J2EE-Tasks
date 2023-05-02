package BuilderPattern3;

public class IPhone extends PhoneBuilder{

    @Override
    public void buildOS() {
        phone.setOS("IOS");
    }

    @Override
    public void buildRam() {
        phone.setRam(2);
    }

    @Override
    public void buildProcessor() {
        phone.setProcessor("A16 Bionic");
    }

    @Override
    public void buildScreen() {
       phone.setScreenSize(5.5);
    }

    @Override
    public void buildBattery() {
        phone.setBattery(3100);
    }
}
