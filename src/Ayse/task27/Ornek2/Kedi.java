package Ayse.task27.Ornek2;

public class Kedi extends Hayvan {

    @Override
    public String getIsim() {
        return super.getIsim();
    }

    public String yıyecek(){
        return "mama";
    }
    @Override
    public int yemekMiktarı() {
        return 20;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 8;
    }
    public String sesı(){
        return "miyav";
    }

}
