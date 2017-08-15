/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Ingles
 */
public class Metodos {
    
    //atributos de la clase Metodos
    int edad=18;
    String nombre="Juan";
    String direccion="Av Chiclana 3444";
    
    public void ImprimirEdad(){//Metodo para imprimir edad
    
        System.out.println(edad);
    }
    
    public void ImprimirNombre(){//Metodo para imprimir nombre
    
        System.out.println(nombre);
    }
    
    public void ImprimirDireccion(){//Metodo para imprimir nombre
    
        System.out.println(direccion);
    }
    
    public static void main(String[] args){
    
       
     Metodos metodo1= new Metodos();
    
    metodo1.ImprimirEdad();
    metodo1.ImprimirNombre();
    metodo1.ImprimirDireccion();
    
    
    }
    
}
