package pe.edu.unmsm.l;

public class MotorCar {

    private Engine engine;

    //constructor, getters y setters

    public void turnOnEngine() {
        engine.on();
    }

    public void accelerate() {
        engine.powerOn(1000);
    }

}
