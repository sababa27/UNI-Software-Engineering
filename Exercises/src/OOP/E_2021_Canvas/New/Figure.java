package OOP.E_2021_Canvas.New;

public abstract class Figure {
    private final int[][] cells;

    public Figure(int[][] cells){
        this.cells = cells;
    }

    public int[][] getCells(){
        return cells;
    }

    abstract void drawFigure();
}
