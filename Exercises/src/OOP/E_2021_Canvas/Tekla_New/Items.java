package OOP.E_2021_Canvas.Tekla_New;

import java.util.ArrayList;
import java.util.List;

public class Items implements Figure {
    private List<Figure> items;

    public Items(List<Figure> items) {
        this.items = items;
    }

    public Items() {
        this(new ArrayList<>());
    }

    public void add(Figure o) {
            items.add(o);
}

    public List<Figure> getItems() {
        return items;
    }

    public void drawObject(int[][] cells){
        for(int i=0; i<items.size(); i++)
            items.get(i).drawObject(cells);
    }
}
