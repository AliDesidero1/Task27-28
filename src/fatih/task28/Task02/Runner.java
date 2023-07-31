package fatih.task28.Task02;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar();
        ToyotaPrius prius = new ToyotaPrius();
        Bus bus = new Bus();


        ArrayList<Object> cars = new ArrayList<>(Arrays.asList(tesla, prius, bus));

        System.out.println("cars = " + cars);

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }


    }
}
