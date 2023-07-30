package fatih.task28.task01;

public class Dikdortgen implements Sekil{

    int kisaKenar = 6;
    int uzunKenar = 10;


    @Override
    public double cevre(int... boyut) {
        return 2*(kisaKenar+uzunKenar);
    }

    @Override
    public double alan(int... boyut) {
        return kisaKenar*uzunKenar;
    }
}
