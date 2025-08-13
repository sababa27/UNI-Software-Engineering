package OOP.E_2021_Canvas.Tekla_New;

public class Rectangle implements Figure{
    private int lowerX;
    private int lowerY;
    private int width;
    private int height;

    public Rectangle(int lowerX, int lowerY, int width, int height) {
        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawObject(int[][] cells){
        for (int x = getLowerX(); x <= getLowerX() + getWidth(); x++) {
            for (int y = getLowerY(); y <= getLowerY() + getHeight(); y++) {
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

    public int getHeight() {
        return height;
    }
}
