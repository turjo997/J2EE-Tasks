import java.util.*;

public class collections {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            ar.add(i);
        }
        ar.removeAll(ar);
        ar.add(11);
        System.out.println(ar.indexOf(11));

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Toyota");
        cars.add("Toyota");
        cars.add("Ford");

        System.out.println(cars);

        for (int i = 0; i < cars.size(); ++i) {
            System.out.println(cars.get(i));
        }

        cars.set(0, "opel");

        System.out.println(cars);

        cars.remove(0);

        System.out.println(cars);

        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }

        boolean result = cars.isEmpty();
        System.out.println(result);

        if (cars.size() == 0) {
            System.out.println("cars list is empty");
        } else {
            System.out.println("cars list is not empty");
        }


        int index = cars.indexOf("BMW");
        System.out.println("Car bmw index is : " + index);

        System.out.println("Toyota car last index is : " + cars.lastIndexOf("Toyota"));

        ArrayList<String> copyOfCarList = new ArrayList<>();

        copyOfCarList.addAll(cars);

        System.out.println(copyOfCarList);

        copyOfCarList.set(0, "Ferari");

        System.out.println(copyOfCarList);

        Iterator itr = copyOfCarList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

}
}
