

package com.mycompany.empleado;

import com.mycompany.empleado.igu.Principal;


public class Empleado {

    public static void main(String[] args) {
        Principal  ventana = new Principal();
         ventana.setVisible(true);
        ventana.setTitle("Registro de empleado");
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        
    }
}
