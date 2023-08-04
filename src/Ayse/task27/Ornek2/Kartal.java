package Ayse.task27.Ornek2;

public class Kartal extends Hayvan {

    @Override
    public String yıyecek() {
        return "kemik";
    }

    @Override
    public int yemekMiktarı() {
        return 3;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 5;
    }

    @Override
    public String sesı() {
        return "havHav";
    }
}
