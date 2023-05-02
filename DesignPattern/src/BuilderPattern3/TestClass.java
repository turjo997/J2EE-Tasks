package BuilderPattern3;

public class TestClass {

    public static void main(String[] args) {

        OrderClass director = new OrderClass();

        PhoneBuilder iphoneBuilder = new IPhone();

        PhoneBuilder samsungBuilder = new Samsung();


        director.setPhoneBuilder(iphoneBuilder);
        director.manufacturePhone();

        Phone p1 = director.getPhone();

        System.out.println(p1.toString());


        director.setPhoneBuilder(samsungBuilder);
        director.manufacturePhone();

        Phone p2 = director.getPhone();

        System.out.println(p2.toString());
    }
}
