public class Box<T> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
         Box<String> box = new Box<>();
         box.setValue("Hello Box");
         System.out.println(box.getValue());
    }
}
