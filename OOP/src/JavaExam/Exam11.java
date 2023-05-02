package JavaExam;


//class A{
//    public A(int i){
//        System.out.println(i);
//    }
//}
//
//public class B extends A{
//    public B(){
//        super(6);
//        this();
//
//    }
//}

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class KOKO implements Serializable{
    public int i;
    public KOKO(int j){
        this.i = j;
    }

    private void writeObject(ObjectOutputStream s)
        throws IOException{
        s.writeLong(i);
    }

    private void readObject(ObjectInputStream s)
            throws IOException{
        s.readInt();
    }
}


public class Exam11 {
//    int i;

    public static void main(String[] args) {
//        int i;
//        private int a = 1;
//        protected int b = 2;
//        public int c = 1;
//
//        System.out.println(a+b+c);




    }
}
