public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        };

        return new ChicagoStyleCheesePizza();
    }
}
