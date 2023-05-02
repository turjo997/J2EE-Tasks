import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
//        File file = new File("D:\\Test\student.txt");
//        System.out.println(file.exists());

        try {
            boolean newFile = false;
            File file = new File("D:\\Test\\fileWrite1.txt");

            System.out.println(file.exists()); // look for a real file

            newFile = file.createNewFile(); // maybe create a file!

            System.out.println(newFile); // already there?

            System.out.println(file.exists()); // look again

        } catch(IOException e) { }


    }

}

