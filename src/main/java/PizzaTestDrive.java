public class PizzaTestDrive {
    public static void main(String[] arg) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.print("First order: a " + pizza.getName());

        Pizza pizza2 = chicagoStore.orderPizza("Pepperoni");
        System.out.println("Second order: a " + pizza2.getName());
    }
}
