package fatih.task28.Task02;

public class TeslaCar extends Vehicle implements IVehicle, IElectric {

    private String name = "Tesla";
    private int model = 2022;
    private double motor = 1.6;

    public TeslaCar() {
    }

    public TeslaCar(String name, int model, double motor) {
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
        return "TeslaCar";
    }


    @Override
    public void changeBattery() {

    }
}
