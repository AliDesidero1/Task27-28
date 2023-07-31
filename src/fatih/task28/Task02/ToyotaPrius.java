package fatih.task28.Task02;

public class ToyotaPrius extends Vehicle implements IVehicle, IElectric, IGas {

    private String name = "ToyotaPrius";
    private int model = 2021;
    private double motor = 1.6;

    public ToyotaPrius() {
    }

    public ToyotaPrius(String name, int model, double motor) {
        this.name = name;
        this.model = model;
        this.motor = motor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "ToyotaPrius";
    }


    @Override
    public void changeBattery() {

    }

    @Override
    public void changeOil() {

    }
}




