import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largerstNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three(3) numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is the largest number");
        }else if(b > a && b > c){
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c + " is the largest number");
        }

        System.out.println("Please enter how many numbers : ");
        int n = input.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0 ; i < n ; ++i){
            int item = input.nextInt();
            ar.add(item);
        }

        Collections.sort(ar);

        System.out.println("The largest number is : " + ar.get(n-1));


    }
}
