package OOP.E_2025.New;

public class Cube implements Figure{
    private final int side;

    public Cube(int side){
        this.side = side;
    }

    @Override
    public double volume(){
        return Math.pow(side, 3);
    }

    @Override
    public String figureToString(){
        return "Shape: Cube, Volume: " + volume();
    }
}
