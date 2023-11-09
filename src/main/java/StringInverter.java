public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder reverser = new StringBuilder(drink.getText());
        reverser.reverse();
        drink.setText(reverser.toString());
    }
}
