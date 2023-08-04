package Ayse.task27.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {

private String id;
private String isim;
private boolean vahsı;
private LocalDate dogumTarıhı;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsı() {
        return vahsı;
    }

    public void setVahsı(boolean vahsı) {
        this.vahsı = vahsı;
    }

    public LocalDate getDogumTarıhı() {
        return dogumTarıhı;
    }

    public void setDogumTarıhı(LocalDate dogumTarıhı) {
        this.dogumTarıhı = dogumTarıhı;
    }


    public abstract String yıyecek();


    public abstract int yemekMiktarı();

    public abstract int gunlukUykuSuresi();


    public  abstract String sesı();

    @Override
    public String toString() {
        return "Hayvan{" +
                "id='" + id + '\'' +
                ", isim='" + isim + '\'' +
                ", vahsı=" + vahsı +
                ", dogumTarıhı=" + dogumTarıhı +
                '}';
    }
}
