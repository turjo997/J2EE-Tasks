package BridgeDesignPattern;

public class Test {

    public static void main(String[] args) {
        IElectricalEquipment fan = new Fan();
        IElectricalEquipment light = new Light();

        Switch fancySwitch = new FancySwitch();
        Switch normalSwitch = new NormalSwitch();

        fancySwitch.setEquipment(fan);

        fancySwitch.on();
        fancySwitch.off();


        fancySwitch.setEquipment(light);

        fancySwitch.on();
        fancySwitch.off();

        normalSwitch.setEquipment(light);

        normalSwitch.on();
        normalSwitch.off();

    }
}
