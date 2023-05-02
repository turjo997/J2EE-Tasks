
@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("This is show method");
    }
}



@FunctionalInterface
interface MyInterface {
    String reverse(String n);
}

public class Demo {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.show();
//
//
//        A obj1 = new A(){
//            public void show(){
//                System.out.println("This is another show method");
//            }
//
//        };
//
//        obj1.show();


        A obj2 = () ->{
            System.out.println("This is another show method");
        };

        obj2.show();




        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface ref = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("JAVA Batch of BJIT"));
    }
}
