
public class Radiou implements Radio {
    
    private boolean encendida = false;
    private boolean tipoSenal =true;
    private float AMactual=530 ;
    private float FMactual=87.9;
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
        if(tipoSenal){
            if(AMactual==1610){
                AMactual=530;
            }
            else{
                AMactual += 10;
        }
     
       
        
    }
    else{
    
        if(FMactual==107.9){
            FMactual=87.9;
        }
      else{
        FMactual += 0.2; 
      }
    }
}
    @Override
    public void bajarEmisora(){
        if(tipoSenal){
            if(AMactual!=530){
                AMactual -= 10;

            }
   
        }
        else{
            if(FMactual!=87.9){
                FMactual -= 0.2;
            }
        
       
        }
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
