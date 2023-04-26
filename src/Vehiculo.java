public interface Vehiculo {
    public static final int velocidadMaxima= 160;
    public static final char clasificacionEficiencia= 'A';

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();

}
