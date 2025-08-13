package OOP.E_2021_Canvas.New;

import java.util.List;

public class Canvas {
    private List<Figure> items;
    private int[][] cells;

    public Canvas(int width, int height) {
        cells = new int[width][height];
    }

    public void draw() {
        for (Figure f : items) {
            f.drawFigure();
        }
    }
}
