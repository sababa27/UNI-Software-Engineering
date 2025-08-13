package OOP.E_2021_Canvas.New;

import java.util.ArrayList;
import java.util.List;

public class Items extends Figure{
    private List<Figure> items;

    public Items(int[][] cells, List<Figure> items){
        super(cells);

        this.items = items;
    }

    public Items(int[][] cells){
        this(cells, new ArrayList<>());
    }

    public List<Figure> getItems() {
        return items;
    }

    public void drawFigure(){
        for (Figure f : getItems()) {
            f.drawFigure();
        }
    }
}
