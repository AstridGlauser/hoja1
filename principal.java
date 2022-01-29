/*
 Arturo Heberto Argueta Avila 21527
 Astrid Glauser 21299

Clase controladora
*/
public class principal {
    private static Display view = new Display();
    private static Radiou radio = new Radiou();
    public static void main(String args[]){
        do{
            switch(view.mainmenu()){//mostrar el menu
                case 1 ->{//on off
                    radio.encenderApagar();
                }
                case 2 ->{//aumentar
                    if(radio.comprobarEncendido()){
                        radio.subirEmisora();
                        view.printer("sintonizando" + String.valueOf(radio.getEmisoraActual()));
                    }else{
                        view.printer("encienda la radio");
                    }
                }
                case 3 ->{//disminuir
                    if(radio.comprobarEncendido()){
                        radio.bajarEmisora();
                        view.printer("sintonizando" + String.valueOf(radio.getEmisoraActual()));
                    }else{
                        view.printer("encienda la radio");
                    }
                }
                case 4 ->{//cambiar frecuencia
                    if(radio.comprobarEncendido()){
                        view.printer(radio.cambiarSenal(!radio.getTipoSenal()));
                    }else{
                        view.printer("encienda la radio");
                    }
                    
                    
                }
                case 5 ->{//guardar actual
                    if(radio.comprobarEncendido()){
                        int boton = view.radioSelection();
                    while(boton > 12 || boton < 1){//verificar que sea valido el boton
                        view.printer("slot invalido");
                        boton = view.radioSelection();
                    }
                    view.printer(radio.guardarEmisoraActual(boton));
                        
                    }else{
                        view.printer("encienda la radio");
                    }
                    
                    
                }
                case 6 ->{//cargar frecuencia
                    if(radio.comprobarEncendido()){
                        int boton = view.radioSelection();
                    while(boton > 12 || boton < 1){//verificar que sea valido el boton
                        view.printer("slot invalido");
                        boton = view.radioSelection();
                    }
                    view.printer(radio.seleccionarEmisoraActual(boton));
                        
                    }else{
                        view.printer("encienda la radio");
                    }
                    
                    
                }
                
            }

        }while(true);
            
    }

}
