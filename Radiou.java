
public class Radiou implements Radio {
    
    private boolean encendida = false;
    private boolean tipoSenal =true;
    private float AMactual ;
    private float FMactual;
    private String[] emisorasGuardadas=new String[12];
  

    @Override
    public void encenderApagar(){
        if(encendida){
            encendida=false;
        }else{
            encendida=true;
        }
        
    }
    @Override
    public boolean  comprobarEncendido(){
        return this.encendida;
        
    }
    
    @Override
    public String guardarEmisoraActual(int numBoton){
        String emisora = "";
        if(tipoSenal){
            emisora = String.valueOf(this.AMactual);
        }else{
            emisora = String.valueOf(this.FMactual);
        }
        emisorasGuardadas[numBoton] = emisora;
    return null;
    
}
    public String seleccionarEmisoraActual(int numBoton){
        String message = "Sintonizando ";
        float emisora = Float.valueOf(emisorasGuardadas[numBoton]);
        if(emisora >=540){//valor minimo de AM
            AMactual = (int) emisora;
            this.tipoSenal = true;
            message += emisora + "AM";
        }else{
            FMactual = emisora;
            this.tipoSenal = false;
            message += emisora + "FM";
        }
        return  message ;
    }
    public String  cambiarSenal(boolean tipoSenal){
        return null;
}
    
    @Override
    public boolean getTipoSenal(){
        return this.tipoSenal;
        
    }
    @Override
    public void subirEmisora(){
        AMactual += 10;
        FMactual += 0.2;
        
    }
    @Override
    public void bajarEmisora(){
        AMactual -= 10;
        FMactual -= 0.2;
    }
    
    @Override
    public float getEmisoraActual(){
        float frecuencia = 0;
        if(tipoSenal){//si es am el modo devuelve la am, de lo contratio devuelve fm
            frecuencia = AMactual;
        }else{
            frecuencia = FMactual;
        }
        return frecuencia;
    }

    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        String message = "Sintonizando ";
        float emisora = Float.valueOf(emisorasGuardadas[numBoton]);
        if(emisora >=540){//valor minimo de AM
            AMactual = (int) emisora;
            this.tipoSenal = true;
            message += emisora + "AM";
        }else{
            FMactual = emisora;
            this.tipoSenal = false;
            message += emisora + "FM";
        }
        return  message ;
    }

    @Override
    public String cambiarSenal(Boolean opciuon) {
        this.tipoSenal = opciuon;
    }

    @Override
    public boolean comprobarEncendida() {
        return this.encendida;
    }

}