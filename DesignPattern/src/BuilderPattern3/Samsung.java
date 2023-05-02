package BuilderPattern3;

public class Samsung extends PhoneBuilder{
    @Override
    public void buildOS() {
        phone.setOS("Android");
    }

    @Override
    public void buildRam() {
        phone.setRam(4);
    }

    @Override
    public void buildProcessor() {
        phone.setProcessor("Snapdragon");
    }

    @Override
    public void buildScreen() {
        phone.setScreenSize(5.5);
    }

    @Override
    public void buildBattery() {
        phone.setBattery(2500);
    }
}
