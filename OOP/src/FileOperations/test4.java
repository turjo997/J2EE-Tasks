package FileOperations;

import java.io.File;

public class test4 {

    public static void main(String[] args) {

        File f = new File("D:\\Test\\newFile.txt");

        if(f.delete()){
            System.out.println(f.getName() + " is deleted successfully");
        }else{
            System.out.println("Unexpected error found in deletion of the file.");
        }
    }
}
