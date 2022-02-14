/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_ejercicio3.servicio;

import guia6_ejercicio3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author benja
 */
public class servicio {
    public Operacion numero1() {
    
        Operacion o1 = new Operacion ();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        
        o1.setNumero1(leer.nextInt());
        
        System.out.println("ingrese el segundo numero");
        
        o1.setNumero2(leer.nextInt());
        
        return o1;
        
}
    
    public void suma (Operacion o1){
        int numero1 = o1.getNumero1();
        int numero2 = o1.getNumero2();
        
        int suma = (numero1 + numero2);
        
        System.out.println("la suma de sus numero es ="+suma);
        
    }
    
    public void resta (Operacion o1){
        int numero1 = o1.getNumero1();
        int numero2 = o1.getNumero2();
        
        int resta = (numero1 - numero2);
        
        System.out.println("la resta de sus numeros es ="+resta);
    }
    
    public void multiplicacion (Operacion o1){
        int numero1 = o1.getNumero1();
        int numero2 = o1.getNumero2();
        
        if (numero1 != 0 && numero2 !=0){
            int multiplicacion = (numero1 * numero2);
            System.out.println("la multiplicacion de sus numeros es ="+multiplicacion);
        }else{
            System.out.println("el resultado es 0, por que esta ingresando un 0");
        }
    }
    
    public void division (Operacion o1){
        int numero1 = o1.getNumero1();
        int numero2 = o1.getNumero2();
        
        if (numero1 != 0 && numero2 !=0){
            float division = (numero1 / numero2);
            System.out.println("la division de sus numeros es ="+division);
        }else{
         System.out.println("el resultado es 0, por que esta ingresando un 0");   
        }
        
        
    }
}


