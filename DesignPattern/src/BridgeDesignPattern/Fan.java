package BridgeDesignPattern;

public class Fan implements IElectricalEquipment{


    @Override
    public void PowerOn() {

        System.out.println("Fan is on");
    }

    @Override
    public void PowerOff() {
        System.out.println("Fan is off");
    }
}
