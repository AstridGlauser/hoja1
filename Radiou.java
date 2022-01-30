
import java.text.DecimalFormat;

/*
 Arturo Heberto Argueta Avila 21527
 Astrid Glauser 21299
  
Clase referente al radio
*/
public class Radiou implements Radio {
    
    private boolean encendida = false;
    private boolean tipoSenal =true;
    private float AMactual=530F;
    private float FMactual= 87.9F;
    private String[] emisorasGuardadas=new String[12];
  

    @Override
    public void encenderApagar(){//encender y apagar el radio, 
        if(encendida){
            encendida=false;
        }else{
            encendida=true;
        }
        
    }
    @Override
    public boolean  comprobarEncendido(){//devuelve el booleano del estado ; true es encendida
        return this.encendida;
        
    }
    
    @Override
    public String guardarEmisoraActual(int numBoton){//recibe la posicion para guardar la emisora actual
        String emisora = "";
        if(tipoSenal){
            emisora = String.valueOf(this.AMactual);
        }else{
            emisora = String.valueOf(this.FMactual);
        }
        emisorasGuardadas[numBoton] = emisora;
    return ("Emisora Guardada con exito");
    
}
    public String seleccionarEmisoraActual(int numBoton){//seleccionar una emisora guardada y colocarla como actual, en caso de no haber indica que no hay freceuncia guardada
       String message = "Sintonizando ";
       String emisoraString = emisorasGuardadas[numBoton]; 
        if(emisoraString != null){
            float emisora = Float.valueOf(emisorasGuardadas[numBoton]); 
        if(emisora >=540F){//valor minimo de AM
            AMactual =  emisora;
            this.tipoSenal = true;
            message += emisora + "AM";
        }else if(emisora >= 87.9F){
            FMactual = emisora;
            this.tipoSenal = false;
            message += emisora + "FM";
        }
        }
        
        else{
            message = "no hay guardado";
        }
        return  message ;
    }
    

    
    @Override
    public boolean getTipoSenal(){//devuelve el tipo de frecuencia actual, true es am
        return this.tipoSenal;
        
    }
    @Override
    public void subirEmisora(){//aumentrar la emisora
        if(tipoSenal){
            if(AMactual==1610){
                AMactual=530;
            }
            else{
                AMactual += 10;
        }
     
       
        
    }
    else{
    
        if(FMactual>107.7){
            
         
            FMactual= 87.9f;
            
          
        }
      else{
        FMactual += 0.2f; 
      }
    }
}
    @Override
    public void bajarEmisora(){//retroceder emisora
         if(tipoSenal){
            if(AMactual!=530){
                AMactual=(int)AMactual -10;

            }else{
                AMactual=(int)1610;
            }
   
   
        }
        else{
            if(FMactual<87.9){
              FMactual = (FMactual-0.2f);
            }else{
                 FMactual=107.9f;
            }
        
       
        }
    }
    
    @Override
    public float getEmisoraActual(){//devuelve la emisora actual sintonizada
        float frecuencia = 0;
        if(tipoSenal){//si es am el modo devuelve la am, de lo contratio devuelve fm
            frecuencia = AMactual;
            
        }else{
          DecimalFormat decimalFormat = new DecimalFormat("#.##");
          frecuencia = Float.valueOf(decimalFormat.format(FMactual));
          
        }
        return frecuencia;
    }

    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {//seleccionar una emisora guardada y colocarla como actual, en caso de no haber indica que no hay freceuncia guardada
        String message = "Sintonizando ";
        float emisora = Float.valueOf(emisorasGuardadas[numBoton]); 
        if(emisora >=540F){//valor minimo de AM
            AMactual = (int) emisora;
            this.tipoSenal = true;
            message += emisora + "AM";
        }else if(emisora >= 87.9F){
            FMactual = emisora;
            this.tipoSenal = false;
            message += emisora + "FM";
        }
        else{
            message = "no hay guardado";
        }
        return  message ;
    }

    @Override
    public String cambiarSenal(Boolean opcion) {//cambia de senal, recie el boolean del tipo a cambiar; true es am
        this.tipoSenal = opcion;
        String message = "Se ha cambiado a ";
        if (tipoSenal) {
            message += "AM";
            
        }else{
             message += "FM";
        }
        
        return message;
    }

}
