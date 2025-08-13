package OOP.E_2021_Canvas.Tekla_New;

public class Circle implements Figure{
    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public void drawObject(int[][] cells){
        for (int x = centerX - radius; x <= centerX + radius; x++) {
            for (int y = centerY - radius; y <= centerY+ radius; y++) {
                double d = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                if (d <= radius) {
                    cells[x][y] = 1;
                }

            }
        }
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
}
