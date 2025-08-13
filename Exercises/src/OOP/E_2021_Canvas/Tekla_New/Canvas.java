package OOP.E_2021_Canvas.Tekla_New;

import java.util.List;

public class Canvas {
    private List<Object> items;
    private int[][] cells;

    public Canvas(int width, int height) {
        cells = new int[width][height];
    }

    public void draw() {
        for (Object o : items) {
            Figure f = (Figure)o;
            f.drawObject(cells);
        }
    }
}
