package fatih.task28.task01;

public class Cember implements Sekil{

    int radius = 5;



    @Override
    public double cevre(int... boyut) {
        return (2*radius*PI);
    }

    @Override
    public double alan(int... boyut) {
        return PI*Math.pow(radius, 2);
    }
}
