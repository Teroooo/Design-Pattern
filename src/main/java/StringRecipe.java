import java.util.List;
import java.util.ListIterator;

public class StringRecipe {

    private final List<StringTransformer> list;
    public StringRecipe(List<StringTransformer> transformers) {
        list=transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer stringTransformer : list) {
            stringTransformer.execute(drink);
        }
    }



}
