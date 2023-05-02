package FileOperations;

import java.io.File;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        try{
            File f = new File("D:\\Test\\newFile.txt");

            if(f.createNewFile()){
                System.out.println("File " + f.getName() + " is created successfully");
            }else{
                System.out.println("File is already exist in the directory.");
            }
        }
        catch (IOException e) {
            System.out.println("An unexpected error is occurred.");
            e.printStackTrace();
        }
    }
}
