
 public interface Radio{
    public void encenderApagar();  // Cambia el estado encendido/apagado
    public boolean comprobarEncendido();
    public String guardarEmisoraActual(int numBoton); // Guarda la emisora como favorita en el botón indicado (array de 12 espacios).
    public String seleccionarEmisoraGuardada(int numBoton); // Reproduce la emisora guardada en uno de los 12 botones.
    public String cambiarSenal(Boolean opciuon);   //true: AM // false:FM
    public boolean getTipoSenal(); ////true: AM // false:FM
    public void subirEmisora(); // Aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
    public void bajarEmisora(); // Disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
    public float getEmisoraActual();
 }
