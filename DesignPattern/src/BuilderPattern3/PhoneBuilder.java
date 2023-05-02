package BuilderPattern3;

import BuilderPattern1.Pizza;

public abstract class PhoneBuilder {

    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void createNewPhone() {
        phone = new Phone();
    }
    public abstract void buildOS();
    public abstract void buildRam();
    public abstract void buildProcessor();
    public abstract void buildScreen();
    public abstract void buildBattery();

}
