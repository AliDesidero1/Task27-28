package task27.Ornek1;

public class Ford extends ch27_Abstraction.task27.Ornek1.BinekOto {

    //abstract metod olduğundan zorunlu olarak
    // yazılmak zorunda (imlemente edildi.)

    @Override
    public String getMarka() {
        return "Ford Focus";
    }

    //abstract class daki yazılmış somut metodları
    // ister olduğu gibi kullanabiliriz.
    // istenirse override yapabiliriz.

    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
