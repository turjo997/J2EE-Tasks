package JavaExam;

import Bank.SBI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

//class Man{
//    Man(){
//        System.out.println("Man");
//    }
//}
//
//class Father extends Man{
//    Father(String type){
//        System.out.println(type);
//    }
//}
//
//class Son extends Father{
//    Son(){
//        super("Father");
//        new Father("Son");
//    }
//}
public class Exam1 {

    public static void main(String[] args) {
//        Integer i = null;
//        int j = i;
//        System.out.println(j);

//        BiFunction<String , String , Boolean> compareString = (x,y)->x.equals(y);
//        System.out.println(compareString.apply("Java8" , "Java8"));


//        new Son();


//        String str = null;
//
//        if(str.length() == 0){
//            System.out.println("1");
//        } else if (str == null) {
//            System.out.println("2");
//        }else {
//            System.out.println("3");
//        }

        List lst = new ArrayList();
        lst.add(new Integer(12).intValue());
        lst.add(new String("Foo"));
        lst.add(new Boolean(true));

        Arrays.sort(lst.toArray());
        for (int i = 0 ; i < lst.size() ; ++i){
            System.out.println(lst.get(i).toString());
        }
    }
}
