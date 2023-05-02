import java.util.ArrayList;

public class lamdaExamples {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);

        ar.forEach((n)->{
            System.out.println(n);
        });



    }
}

