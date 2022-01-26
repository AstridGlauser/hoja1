/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author imarg
 */
public class radio {
    
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
}
