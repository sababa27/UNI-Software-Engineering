package OOP.E_2021_Canvas.Tekla_New;

public class Square implements Figure {
    private int lowerX;
    private int lowerY;
    private int width;

    public Square(int lowerX, int lowerY, int width) {
        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.width = width;
    }

    @Override
    public void drawObject(int[][] cells) {
        for (int x = getLowerX(); x <= getLowerX() + getWidth(); x++) {
            for (int y = getLowerY(); y <= getLowerY() + getWidth(); y++) {
                cells[x][y] = 1;
            }
        }
    }

    public int getLowerX() {
        return lowerX;
    }

    public int getLowerY() {
        return lowerY;
    }

    public int getWidth() {
        return width;
    }
} 