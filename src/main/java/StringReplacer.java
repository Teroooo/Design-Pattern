public class StringReplacer implements StringTransformer{
    private char a;
    private char b;
    public StringReplacer(char a_, char x_) {
        a=a_;
        b=x_;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(a,b));
    }
}
