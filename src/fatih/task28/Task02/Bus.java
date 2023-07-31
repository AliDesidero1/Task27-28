package fatih.task28.Task02;

public class Bus  extends Vehicle implements IVehicle, IDiesel {

    private String name = "Bus";
    private int model = 2017;
    private double motor = 2.0;

    public Bus() {
    }

    public Bus(String name, int model, double motor) {
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
        return "Bus";
    }


    @Override
    public void changeDiesel() {

    }
}
