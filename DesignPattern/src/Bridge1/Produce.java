package Bridge1;

public class Produce implements Workshop{
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
