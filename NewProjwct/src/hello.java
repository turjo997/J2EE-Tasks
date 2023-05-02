import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        int n;
        Scanner ip = new Scanner(System.in);
//        n = ip.nextInt();
//        for(int i = 0 ; i < n ; ++i){
//            System.out.println(i+1);
//        }

        int x = 07;
        //System.out.println(x);

        x = 010;

        //System.out.println(x);

        long jo = 110599L;
        long so = 0xFFFFl;

//        System.out.println(jo);
//        System.out.println(so);

        byte a = 3;
        byte b = 8;

        byte c = (byte) (b+a);

        //System.out.println(c);

        int z = 100;
        long y = z;

       // System.out.println(y);

        float f = 100.001f;
        //System.out.println(f);
        int g = (int) f;

        //System.out.println(g);

        double d = 100l;

        //System.out.println(d);

        int myArr[] = new int[3];
        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;

        for (int item : myArr){
            System.out.println(item);
        }
        //System.out.println(myArr);

        int[] carList = new int[] {3, 6, 3, 1, 6, 3, 4, 1};

        for (int item : carList){
            System.out.println(item);
        }




    }
}
