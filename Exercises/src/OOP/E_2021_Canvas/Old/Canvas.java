package OOP.E_2021_Canvas.Old;

import java.util.List;

public class Canvas {
    private List<Object> items;
    private int[][] cells;

    public Canvas(int width, int height) {
        cells = new int[width][height];
    }

    public void draw() {
        for (Object o : items) {
            drawObject(o);
        }
    }

    private void drawObject(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            for (int x = r.getLowerX(); x <= r.getLowerX() + r.getWidth(); x++) {
                for (int y = r.getLowerY(); y <= r.getLowerY() + r.getHeight(); y++) {
                    cells[x][y] = 1;
                }
            }
        } else if (o instanceof Square) {
            Square s = (Square) o;
            for (int x = s.getLowerX(); x <= s.getLowerX() + s.getWidth(); x++) {
                for (int y = s.getLowerY(); y <= s.getLowerY() + s.getWidth(); y++) {
                    cells[x][y] = 1;
                }
            }
        } else if (o instanceof Circle) {
            Circle c = (Circle) o;
            for (int x = c.getCenterX() - c.getRadius(); x <= c.getCenterX() + c.getRadius(); x++) {
                for (int y = c.getCenterY() - c.getRadius(); y <= c.getCenterY() + c.getRadius(); y++) {
                    double d = Math.sqrt(Math.pow(x - c.getCenterX(), 2) + Math.pow(y - c.getCenterY(), 2));
                    if (d <= c.getRadius()) {
                        cells[x][y] = 1;
                    }

                }
            }
        } else if (o instanceof Items) {
            Items i = (Items) o;
            for (Object q : i.getItems()) {
                drawObject(q);
            }
        }
    }
}
