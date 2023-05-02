package BridgeDesignPattern;

public class Switch {

    private IElectricalEquipment equipment;

    public IElectricalEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(IElectricalEquipment equipment) {
        this.equipment = equipment;
    }

    public void on(){
        System.out.println("Switch on the equipment");
        equipment.PowerOn();
    }

    public void off(){
        System.out.println("Switch off the equipment");
        equipment.PowerOff();
    }
}
