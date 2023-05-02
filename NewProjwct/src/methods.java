public class methods {
    public static void main(String[] args) {
          String s1 = "hello";
          String s2 = "";
          String s3 = "meee";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));


        String st1 = new String("INDIA IS MY COUNTRY");

         // input string in lowercase
        String st2 = new String("india is my country");

        String st3 = new String("INDIA IS MY COUNTRY");

        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));


        String st4 = "java by javapoint";
        System.out.println(st4.endsWith("t"));
        System.out.println(st4.endsWith("point"));


        String str = "Welcome to JavaTpoint";


        System.out.println(str.endsWith("javaTpoint"));
        System.out.println(str.endsWith("Javatpoint"));
        System.out.println(str.endsWith("JavaTpoint"));



        String a = " Hello World ";
        System.out.println(a + "javatpoint");
        System.out.println(a.trim() + "javapoint");



        String st5 = "javatpoint is a good website";

        String replaceString =  st5.replace('a' , 'E');

        System.out.println(replaceString);

        String replaceString1 =  st5.replace("good" , "best");

        System.out.println(replaceString1);

        String st = "Java is a good string";

        String arr[] = st.split(" " , 3);


        String arr1[] = st.split(" ");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);














    }
}
