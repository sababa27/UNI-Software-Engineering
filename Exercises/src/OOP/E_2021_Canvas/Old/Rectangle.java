package OOP.E_2021_Canvas.Old;

public class Rectangle {
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
