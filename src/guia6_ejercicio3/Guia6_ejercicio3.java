/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_ejercicio3;

import guia6_ejercicio3.entidades.Operacion;
import guia6_ejercicio3.servicio.servicio;

/**
 *
 * @author benja
 */
public class Guia6_ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicio vs = new servicio();
        
        Operacion o1 = vs.numero1();
        
        vs.suma(o1);
        vs.resta(o1);
        vs.multiplicacion(o1);
        vs.division(o1);
       
         
        
    }
    
}
