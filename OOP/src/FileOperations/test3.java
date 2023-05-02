package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        try {
            File f = new File("D:\\Test\\newFile.txt");

            Scanner dataReader = new Scanner(f);

            while (dataReader.hasNext()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }

            dataReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unexcpected error occurred!");
            e.printStackTrace();
        }
    }
}
