package BridgeDesignPattern;

public class Light implements IElectricalEquipment {

    @Override
    public void PowerOn() {

        System.out.println("Light is on");
    }

    @Override
    public void PowerOff() {
        System.out.println("Light is off");
    }
}
