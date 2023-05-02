import java.io.IOException;
import java.util.*;

public class NewTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();

        try {
            System.out.println("How many age you want to store : ");
            int n = input.nextInt();

            for (int i = 0; i < n; ++i) {
                int x = input.nextInt();
                ar.add(x);
            }

            System.out.println("The ages are as follows : ");
            for (int i : ar) {
                System.out.println(i);
            }

            System.out.println("Enter the value for knowing it's last index : ");
            int value = input.nextInt();

            System.out.println("Last Index of " + value + " is : " + ar.lastIndexOf(value));


            System.out.println("Please enter 2 numbers (index,value) for updating : ");
            int index = input.nextInt();
            int val = input.nextInt();
            ar.set(index, val);

            System.out.println("After updating the array is : " + ar);

            Collections.sort(ar);

            System.out.println("After sorting the array look like : " + ar);

            System.out.println("Which index age you want to remove : ");
            int ageIndex = input.nextInt();
            ar.remove(ageIndex);
            System.out.println("After removing the array look loike : " + ar);

            try {
                Iterator it = ar.iterator();

                int sumOfAge = 0;
                while (it.hasNext()) {
                    sumOfAge += (int) it.next();
                }

                System.out.println("Average of Age is : " + sumOfAge / n);
            } catch (ArithmeticException e1) {
                System.out.println(e1);
            }

            try {

                System.out.println("How many age of number you want to know for calculating the frequency : ");
                int arSize = input.nextInt();

                HashMap<Integer, Integer> mp = new HashMap<>();

                for (int i = 0; i < arSize; ++i) {
                    if (mp.containsKey(ar.get(i))) {
                        mp.put(ar.get(i), mp.get(ar.get(i)) + 1);
                    } else {
                        mp.put(ar.get(i), 1);
                    }
                }

                System.out.println("The keys are as follows: " + mp.keySet());
                System.out.println("The map values are as follows :" + mp.values());

                for (Map.Entry entry : mp.entrySet()) {
                    System.out.println(entry.getKey() + " frequency is : " + entry.getValue());
                }

                System.out.println("Map list : " + mp);

                System.out.println("Enter a value removing from the map : ");
                int vals = input.nextInt();
                mp.remove(vals);

                System.out.println("Updated list of elements : " + mp);

                System.out.println("Map size is : " + mp.size());

            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println(e2);
            }


        } catch (ArithmeticException e1) {
            System.out.println(e1);
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            boolean result = ar.isEmpty();

            if (result) {
                System.out.println("The age array is empty");
            } else {
                System.out.println("The age array is not empty");
            }
            System.out.println("The code has been executed perfectly");
        }

    }
}
