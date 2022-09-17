package pe.edu.unmsm.liskovsubstitution;

public class ElectricCar implements Car {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("¡No tengo motor!");
    }

    @Override
    public void accelerate() {
        //código para acelerar el carro eléctrico
    }

}
