public class NYStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("pepperoni")) {
            return new NYStylePepperoniPizza();
        };

        return new NYStyleCheesePizza();
    }
}
