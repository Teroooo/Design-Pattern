import java.util.List;
import java.util.ListIterator;

public class StringRecipe {

    private List<StringTransformer> list;
    public StringRecipe(List<StringTransformer> transformers) {
        list=transformers;
    }

    public void mix(StringDrink drink) {
        ListIterator<StringTransformer> it = list.listIterator();
        while (it.hasNext()) {
            it.next().execute(drink);
        }
    }
}
