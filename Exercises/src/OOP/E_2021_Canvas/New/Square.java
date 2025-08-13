package OOP.E_2021_Canvas.New;

public class Square extends Figure{
    private int lowerX;
    private int lowerY;
    private int width;

    public Square(int[][] cells, int lowerX, int lowerY, int width){
        super(cells);

        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.width = width;
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

    public void drawFigure(){
        for (int x = getLowerX(); x <= getLowerX() + getWidth(); x++) {
            for (int y = getLowerY(); y <= getLowerY() + getWidth(); y++) {
                getCells()[x][y] = 1;
            }
        }
    }
}
