import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class wrapper {

    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        int s = 0;
//
//        for(Integer num : numbers){
//            s += num;
//        }
//
//        System.out.println("Sum of the numbers: "+s);
//        Collections.sort(numbers);
//        System.out.println("The numbers are: " +numbers);
//
//        byte[] bytes = {72,101,108,108,111,32,87,111,114,108,100};
//        String str = new String(bytes);
//        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder();
//
//        for(byte b : bytes){
//            sb.append(Byte.toString(b)).append(" ");
//        }
//
//        System.out.println(sb);
//        String byteStr = sb.toString().trim();
//
//        System.out.println(byteStr);

        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0 ; i < 10 ; ++i){
            ar.add(i);
        }

        ar.removeAll(ar);

        ar.add(11);

        System.out.println(ar.indexOf(11));




    }
}
