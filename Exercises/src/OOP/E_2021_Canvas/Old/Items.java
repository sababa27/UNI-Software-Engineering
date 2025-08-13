package OOP.E_2021_Canvas.Old;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Object> items;

    public Items(List<Object> items) {
        this.items = items;
    }

    public Items() {
        this(new ArrayList<>());
    }

    public void add(Object o) {
        if (o instanceof Circle || o instanceof Square || o instanceof Rectangle || o instanceof Items) {
            items.add(o);
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    public List<Object> getItems() {
        return items;
    }
}
