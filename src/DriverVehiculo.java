public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Diesel", 10);
        System.out.println(camion1);
        System.out.println(camion1.encender());
        camion1.avanzar();
        camion1.frenar();
        System.out.println(camion1.apagar());

        System.out.println("------Motocicleta-------");
    Motocicleta moto1 = new Motocicleta();
        System.out.println(moto1);
        moto1.encender();
        moto1.avanzar();
        moto1.hacerCaballito();
        moto1.frenar();
        moto1.apagar();


    }
}
