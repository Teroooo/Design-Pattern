import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink) {
        StringBuilder txt = new StringBuilder(drink.getText());
        for(int i = 0; i<drink.getText().length(); i++) {
            char c = txt.charAt(i);
            if (isUpperCase(c)) {
                txt.setCharAt(i, toLowerCase(c));
            }
            else {
                txt.setCharAt(i, toUpperCase(c));
            }
        }
        drink.setText(txt.toString());
    }
}
