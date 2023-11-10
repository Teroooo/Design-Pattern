public class SmartStrategy implements OrderingStrategy{
    private StringDrink drink;
    private StringRecipe recipe;
    private StringBar bar;
    @Override
    public void wants(StringDrink drink_, StringRecipe recipe_, StringBar bar_) {
        drink = drink_;
        recipe = recipe_;
        bar = bar_;
        if (bar.isHappyHour()) {
            bar.order(drink,recipe);
        }
    }


    @Override
    public void happyHourStarted(StringBar bar) {
        bar.order(drink,recipe);
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
