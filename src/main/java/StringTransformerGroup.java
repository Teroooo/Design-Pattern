import java.util.List;
import java.util.ListIterator;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> list;
    public StringTransformerGroup(List<StringTransformer> transformers) {
        list = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        ListIterator<StringTransformer> it = list.listIterator();
        while (it.hasNext()) {
            it.next().execute(drink);
        }
    }
}
