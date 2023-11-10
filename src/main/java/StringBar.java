public class StringBar extends Bar{
    private boolean isHappyHour;

    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour() {
        isHappyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
        notifyObservers();
    }


    void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }

}
