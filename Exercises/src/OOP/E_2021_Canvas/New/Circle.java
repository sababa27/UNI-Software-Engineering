package OOP.E_2021_Canvas.New;

public class Circle extends Figure{
    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int[][] cells, int centerX, int centerY, int radius){
        super(cells);

        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    void drawFigure(){
        for (int x = getCenterX() - getRadius(); x <= getCenterX() + getRadius(); x++) {
            for (int y = getCenterY() - getRadius(); y <= getCenterY() + getRadius(); y++) {
                double d = Math.sqrt(Math.pow(x - getCenterX(), 2) + Math.pow(y - getCenterY(), 2));
                if (d <= getRadius()) {
                    getCells()[x][y] = 1;
                }

            }
        }
    }
}
