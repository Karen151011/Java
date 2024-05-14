
package com.mycompany.calculadora.logica;

import com.mycompany.calculadora.igu.Inicio;


public class HacerCalculadora {

    public HacerCalculadora() {
    }
    
    public void ventana(){
        Inicio ventana1= new Inicio();
        //ponemos esto para que seqa visible la ventana 
        ventana1.setVisible(true);
        //modificamos el titulo de la ventana 
        ventana1.setTitle("Inicio");
        //no permititr que se pueda hacer mas grande la ventana 
        ventana1.setResizable(false);
        //poner la ventana en el centro 
        ventana1.setLocationRelativeTo(null);
        
        
    }
}
