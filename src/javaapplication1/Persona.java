/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorPreferido;
    private String sistemaOperativo;

    public Persona(String nombre, String apellido, int edad, String hobbie, String editorPreferido, String sistemaOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorPreferido = editorPreferido;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Persona() {
    }
    
    public void pedirDatos(){
        System.out.print("Ingrese nombre: ");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.print("Ingrese apellido: ");
        this.apellido = new Scanner(System.in).nextLine();
        System.out.print("Ingrese edad: ");
        this.edad = new Scanner(System.in).nextInt();
        System.out.print("Ingrese hobbie: ");
        this.hobbie = new Scanner(System.in).nextLine();
        System.out.print("Ingrese editor preferido: ");
        this.editorPreferido = new Scanner(System.in).nextLine();
        System.out.print("Ingrese sistema operativo: ");
        this.sistemaOperativo = new Scanner(System.in).nextLine();
    }
    
    public void mostrarDatos(){
        System.out.println("\n\nMostrando datos: ");
        System.out.print("Nombre: " + nombre);
        System.out.print("\nApellido: " + apellido);
        System.out.print("\nEdad: " + edad);
        System.out.print("\nHobbie: " + hobbie);
        System.out.print("\nEditor preferido: " + editorPreferido);
        System.out.println("\nSistema operativo: " + sistemaOperativo);
    }
    
    
}
