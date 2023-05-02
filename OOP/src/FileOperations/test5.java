package FileOperations;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class test5 {


    public static void main(String[] args) throws FileNotFoundException {


        try {
            Formatter formatter = new Formatter("D:\\Test\\newFile.txt");
            Scanner input = new Scanner(System.in);

            System.out.println("How many students: ");

            int num = input.nextInt();

            for(int i = 1 ; i<= num ; ++i) {

                System.out.println("Enter student ID and Name \r\n: ");
                String id = input.next();
                String name = input.next();

                formatter.format("%s %s\r\n",id , name);
            }

            formatter.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }



    }
}
