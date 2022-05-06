/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_01_01;

/**
 *
 * @author Jhonny Aguilar _ Angelo Guaraca
 */
public class Tarea_01_01 {

     public static void main(String[] args) {
      //clase 1 Carro  
        var carrito = new Carro ();
        carrito.Color="Rojo";
        carrito.Placa="AAA0254";
        carrito.Marca="Mercedes";
        carrito.yearVehiculo=2015;
        
        
        var carrito2 = new Carro ();
        carrito2.Color="Verde";
        carrito2.Placa="ABB2341";
        carrito2.Marca="Nissan";
        carrito2.yearVehiculo=2020;
       
        System.out.println("\nEl color del carro 1 es:"+carrito.Color); 
        System.out.println("Su numero de placa es:"+carrito.Placa); 
        System.out.println("Es de marca:"+carrito.Marca);
        System.out.println("Del año:"+carrito.yearVehiculo); 
        
        
        System.out.println("\nEl color del carro 2 es:"+carrito2.Color);
        System.out.println("Su numero de placa es:"+carrito2.Placa);
        System.out.println("Es de marca:"+carrito2.Marca);
        System.out.println("Del año:"+carrito2.yearVehiculo);
        
        
        
     //clase 2 perro
     
        var perrito = new Perro ();
        perrito.Nombre="firu";
        perrito.Raza = "Salchichon";
        perrito.Edad=5;
        perrito.peso= 16;
        perrito.Dueño="Jhonny Aguilar";
        
        var perrito2 = new Perro();
        perrito2.Nombre ="Boby";
        perrito2.Raza = "Runa";
        perrito2.Edad=2;
        perrito2.peso=6;
        perrito2.Dueño="Angelo Guaraca";
        
        System.out.println("\nEl nombre del perrito es:"+perrito.Nombre);
        System.out.println("La raza del perrito es:"+perrito.Raza);
        System.out.println("La edad del perrito en meses es:"+perrito.Edad);
        System.out.println("El peso del perrito en libras es de:"+perrito.peso);
        System.out.println("El dueño de este perrito es:"+perrito.Dueño);
        
        System.out.println("\nEl nombre del perrito 2 es:"+perrito2.Nombre);
        System.out.println("La raza del perrito 2 es:"+perrito2.Raza);
        System.out.println("La edad del perrito 2 en meses es:"+perrito2.Edad);
        System.out.println("El peso del perrito 2 en libras es de:"+perrito2.peso);
        System.out.println("El dueño de este perrito 2 es:"+perrito2.Dueño);
        
     //Clase 3 Persona   
     
        var p1 = new Persona();
        p1.Nombre="Jhonny Aguilar";
        p1.Cedula="0105855530";
        p1.Edad=23;
        
        var p2 = new Persona();
        p2.Nombre="Angelo Guaraca";
        p2.Cedula="0101258468";
        p2.Edad=24;
        
        System.out.println("\nEl nombre de la primera persona es:"+p1.Nombre);
        System.out.println("La cedula de la primera persona es:"+p1.Cedula);
        System.out.println("La edad de la primera persona es:"+p1.Edad);
        
        System.out.println("\nEl nombre de la segunda persona es:"+p2.Nombre);
        System.out.println("La cedula de la segunda persona es:"+p2.Cedula);
        System.out.println("La edad de la segunda persona es:"+p2.Edad);
    }
}
