/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Estudiante {
   
   Scanner sc = new Scanner(System.in); 
    
   private String nombre;
   private String id;
   private double nota;
   private String estado;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
   
   
    
    
     public void llenarEstudiante(){
         System.out.print("Ingrese el nombre: ");
        nombre= sc.nextLine();
        
        System.out.print("Ingrese el ID: ");
        id = sc.nextLine();
   
       
    }
     public void promedio(){
         System.out.println("Ingrese la nota de tareas: ");
         double n1 = sc.nextDouble();
         sc.nextLine();
          System.out.println("Ingrese la nota de trabajos: ");
         double n2 = sc.nextDouble();
        sc.nextLine();
         System.out.println("Ingrese la nota de Examen: ");
         double n3 = sc.nextDouble();
        sc.nextLine();
        nota=(n1+n2+n3)/3;
         
        if (nota >= 7) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
      
    }
    public void mostrarEstudiante(){
        
      
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+id);
        
        System.out.println("Promedio: "+nota);
        System.out.println("Estado: "+estado);
        
    }
    
    
}
