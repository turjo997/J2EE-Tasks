package FileOperations;

import java.io.File;
import java.io.IOException;

public class test1 {

    public static void main(String[] args) {

            File f = new File("D:\\Test\\newFile.txt");

            if(f.exists()){
                System.out.println("The name of the file is: " + f.getName());

                // Getting path of the file
                System.out.println("The absolute path of the file is: " + f.getAbsolutePath());

                // Checking whether the file is writable or not
                System.out.println("Is file writeable?: " + f.canWrite());

                // Checking whether the file is readable or not
                System.out.println("Is file readable " + f.canRead());

                // Getting the length of the file in bytes
                System.out.println("The size of the file in bytes is: " + f.length());
            }else{
                System.out.println("The file does not exist.");
            }


    }
}
