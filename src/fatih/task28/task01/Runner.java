package fatih.task28.task01;

public class Runner {
    public static void main(String[] args) {

        Cember cember = new Cember();
        Dikdortgen dikdortgen = new Dikdortgen();
        Kare kare = new Kare();

        System.out.println("cember.cevre() = " + cember.cevre());
        System.out.println("cember.alan() = " + cember.alan());

        System.out.println("dikdortgen.cevre() = " + dikdortgen.cevre());
        System.out.println("dikdortgen.alan() = " + dikdortgen.alan());

        System.out.println("kare.cevre() = " + kare.cevre());
        System.out.println("kare.alan() = " + kare.alan());

    }
}
