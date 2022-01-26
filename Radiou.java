/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author imarg
 */
public class Radiou {
    
    private boolean encendida = false;
    private boolean tipoSenal =true;
    private float AMactual ;
    private float FMactual;
    private String[] emisorasGuardadas=new String[12];
    private int numBoton;
    
    
    
    

    public void encenderApagar(){
        if(encendida){
            encendida=false;
        }else{
            encendida=true;
        }
        
    }
    public boolean  comprobarEncendido(){
        return this.encendida;
        
    }
    
    public String guardarEmisoraActual(int numBoton){
    return null;
    
}
    public String seleccionarEmisoraActual(int numBoton){
        return null;
    }
    public String  cambiarSenal(boolean tipoSenal){
        return null;
}
    
    public boolean getTipoSenal(){
        
        return false;
        
    }
    public void subirEmisora(){
        
    }
    public void bajarEmisora(){
        
    }
    
    public float getEmisoraActual(){
        
    }

}