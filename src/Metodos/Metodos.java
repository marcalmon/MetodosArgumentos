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
    
    public void ImprimirDireccion(){//Metodo para imprimir direccion
    
        System.out.println(direccion);
    }
    
    public void ImprimirEdad(int numero1){//Metodo para imprimir edad con argumento
    
        System.out.println(numero1);
    }
    
    public void ImprimirEdad(int numero1, int numero2){//Metodo para imprimir edad con argumento
    
        System.out.println(numero1+" "+numero2);
    }
    
    public void Suma(int numero1, int numero2){
    
        int suma;
        suma=numero1+numero2;
        System.out.println(suma);
    }
    
    public void Resta(int numero1, int numero2){
    
        int resta;
        resta=numero1-numero2;
        System.out.println(resta);
    }
    
    public static void main(String[] args){
    
       
    Metodos metodo1= new Metodos(); //Se crea nuevo objeto llamado metodo1   
    metodo1.ImprimirEdad();
    metodo1.ImprimirNombre();
    metodo1.ImprimirDireccion();
    
    Metodos Miguel= new Metodos();//Se crea nuevo objeto llamdo Miguel
    Miguel.edad=25;
    Miguel.nombre="Miguel";
    Miguel.direccion="Rucci 4441";
    
    Miguel.ImprimirEdad();
    Miguel.ImprimirNombre();
    Miguel.ImprimirDireccion();
    
    Metodos Pedro= new Metodos();//Se crea nuevo objeto llamdo Pedro
    Pedro.edad=33;
    Pedro.nombre="Pedro";
    Pedro.direccion="Av soldado de la Frontera";
    
    Pedro.ImprimirEdad();
    Pedro.ImprimirNombre();
    Pedro.ImprimirDireccion();
    
    Miguel.ImprimirEdad(38);
    
    int numero1=34;
    int numero2=20;
    Miguel.ImprimirEdad(numero1, numero2);
    
    Pedro.Suma(numero1, numero2);
    metodo1.Resta(numero1, numero2);
    }
    
}
