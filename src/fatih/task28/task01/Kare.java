package fatih.task28.task01;

import task28.task01.Dikdortgen;

public class Kare extends Dikdortgen implements Sekil{

    int kenar = 7;

    @Override
    public double cevre(int... boyut) {
        return 4*kenar;
    }

    @Override
    public double alan(int... boyut) {
        return Math.pow(kenar, 2);
    }
}
