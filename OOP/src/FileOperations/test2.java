package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter fwrite = new FileWriter("D:\\Test\\newFile.txt");

            fwrite.write("The earth is beautiful");
            fwrite.close();
            System.out.println("Content is successfully wrote to the file.");
        }catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }



    }
}
