package FileOperations;

import java.io.*;

public class test6 {

    public static void main(String[] args) {
        char[] in = new char[50]; // to store input
        int size = 0;
        try {
            File file = new File("D:\\Test\\random.txt");
            FileWriter fw =new FileWriter(file);
            // create an actual file// & a FileWriter obj
            BufferedWriter bw =new BufferedWriter(fw);
            bw.write("howdy");
            bw.newLine();
            bw.write("folks");  // write characters to the file
            bw.flush();  // flush before closing
            bw.close();  // close file when done

            FileReader fr =new FileReader(file);
            // create a FileReader object
            BufferedReader br =new BufferedReader(fr);
            String s;
            while( (s = br.readLine()) != null) // read data
                System.out.println(s);
            br.close();  // again, always close
        } catch(IOException e) { }
    }
}
