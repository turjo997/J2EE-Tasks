package Bridge1;

public abstract class Automobile {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Automobile(Workshop ws1 , Workshop ws2){
        this.workshop1 = ws1;
        this.workshop2 = ws2;
    }

    abstract public void manufacture();
}
