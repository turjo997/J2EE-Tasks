import java.util.Arrays;
import java.util.Scanner;

public class javaMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string");
        String str = input.nextLine();


        String newString = Arrays.toString(str.trim().replaceAll("a" , "e").split(" "));

        System.out.println(newString);

        String result[] = str.trim().replaceAll("e", "a").split(" ");

        for (String st : result){
            System.out.println(st);
        }
        //System.out.println(result[0]);

    }
}


