package BuilderPattern3;

public class OrderClass {
    private PhoneBuilder phoneBuilder;

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public void manufacturePhone(){

        phoneBuilder.createNewPhone();
        phoneBuilder.buildOS();
        phoneBuilder.buildRam();
        phoneBuilder.buildProcessor();
        phoneBuilder.buildScreen();
        phoneBuilder.buildBattery();

    }
}
