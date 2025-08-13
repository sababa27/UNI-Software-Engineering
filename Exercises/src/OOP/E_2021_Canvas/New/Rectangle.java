package OOP.E_2021_Canvas.New;

public class Rectangle extends Figure{
    private int lowerX;
    private int lowerY;
    private int width;
    private int height;

    public Rectangle(int[][] cells, int lowerX, int lowerY, int width, int height){
        super(cells);

        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.width = width;
        this.height = height;
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

    void drawFigure(){
        for (int x = getLowerX(); x <= getLowerX() + getWidth(); x++) {
            for (int y = getLowerY(); y <= getLowerY() + getHeight(); y++) {
                getCells()[x][y] = 1;
            }
        }
    }
}
