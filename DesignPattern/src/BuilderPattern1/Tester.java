package BuilderPattern1;

public class Tester {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaaianPizzaBuilder();

        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza1 = waiter.getPizza();

        System.out.println(pizza1.toString());


        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza2 = waiter.getPizza();

        System.out.println(pizza2.toString());
    }
}
