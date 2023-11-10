public class HumanClient implements Client {
    private final OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy_) {
        strategy = strategy_;
    }

    @Override
    public void happyHourStarted(Bar bar) {
       strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
}
