package OOP.E_2025.New;

public class Sphere implements Figure{
    private final int radius;

    public Sphere(int radius){
        this.radius = radius;
    }

    @Override
    public double volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String figureToString(){
        return "Shape: Sphere, Volume: " + volume();
    }
}
