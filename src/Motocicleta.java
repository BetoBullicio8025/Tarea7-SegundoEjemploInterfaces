public class Motocicleta implements Vehiculo{
    private int CC= 200;
    private String marca= "Bajaj";

    @Override
    public String toString() {
        return "Motocicleta{" +
                "CC=" + CC +
                ", marca='" + marca + '\'' +
                '}';
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motocicleta() {
    }

    public Motocicleta(int CC, String marca) {
        this.CC = CC;
        this.marca = marca;
    }

    public String hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme una costilla...");
        return null;
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta " + this.marca);
        return false;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando motocicleta...");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de " + this.CC + " cilidrada");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando");


    }
}
