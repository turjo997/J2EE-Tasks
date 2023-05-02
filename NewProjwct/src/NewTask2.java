import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@FunctionalInterface
interface Trinagle{
    double area(double a , double b);
}

interface MyInterface1 {
    void removeDuplicates(ArrayList<Integer> ar);
}


class Product{
    int id;
    String name;
    float price;
     Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class NewTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Trinagle ref = (a , b)->{
            double result = 0.0;
            return 0.5 * a * b;
        };

        System.out.println("Please enter the base and height for calculating the area of the triangle : ");
        double base = input.nextDouble();
        double height = input.nextDouble();


        System.out.println("Triangle area is : "+ref.area(base,height));

        MyInterface1 ob = (ar) ->{

            Collections.sort(ar);
            for(int i = 0 ; i < ar.size()  ; ++i){
                int item = ar.get(i);
                while (i < ar.size() -1 && item == ar.get(i+1)){
                    ++i;
                }
                System.out.println("Element is : "+ar.get(i));
            }
        };


        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Please enter the value of n: ");

        int n = input.nextInt();
        System.out.println("Please enter the values of the array : ");

        for(int i = 0 ; i < n ; ++i){
            int x = input.nextInt();
            ar.add(x);
        }

        ob.removeDuplicates(ar);

        List<Product> productsList = new ArrayList<Product>();


        productsList.add(new Product(1,"Nokia",25000f));
        productsList.add(new Product(2,"Walton",30000f));
        productsList.add(new Product(3,"LG",28000f));
        productsList.add(new Product(4,"Samsung",28000f));
        productsList.add(new Product(5,"Iphone",90000f));


        List<String> productPriceList2 =productsList.stream()
                .filter((p) -> p.price > 10000)
                .map((p)->p.name)
                .collect(Collectors.toList());

        System.out.println(productPriceList2);
    }

}
