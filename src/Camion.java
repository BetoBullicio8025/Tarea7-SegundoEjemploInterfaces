public class Camion implements Vehiculo{

    private String combustible;
    private double tonelaje;

    public Camion(String combustible, double tonelaje) {
        this.combustible = combustible;
        this.tonelaje = tonelaje;
    }

    public Camion() {
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", tonelaje=" + tonelaje +
                '}';
    }

    public void transportar(){
        System.out.println("Transportando mercancia...");
    }



    @Override
    public boolean encender() {
        System.out.println("Encendiendo camion de combustible" + this.combustible);
        return Math.random() <=0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Aoagando el camion...");
        return Math.random() <=0.8;
    }

    @Override
    public void avanzar() {
        System.out.println("El camion esta avanzando");
    }

    @Override
    public void frenar() {
        System.out.println("El camion estra frenando con motor");

    }
}
