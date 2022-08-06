package pe.edu.unmsm.l;

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
