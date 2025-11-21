/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profesor  = new Profesor();
        Materia materia = new Materia();
        Estudiante estudiante = new Estudiante();
        Scanner sc = new Scanner(System.in);
        
      boolean continuar = true;
      int op=0;
         do{
             System.out.println("------OPCIONES-------");
             System.out.println("1.Registrar Profesor ");
             System.out.println("2.Registrar Materia ");
             System.out.println("3.Asignar Materia ");
             System.out.println("4.Registrar Estudiante ");
             System.out.println("5.Asignar Estudiante ");
             System.out.println("6.Mostrar Profesor ");
             System.out.println("7.Salir ");
             System.out.println("Digite una opcion");
             op = sc.nextInt();
             sc.nextLine();
             
             switch(op){
                 case 1: profesor.registrarProfesor();break;
                 
                 case 2 : materia = new Materia();
                 materia.registrarMateria();
                 break;
                 
                 case 3 : 
                     if(profesor != null && materia != null){
                         profesor.agregarMateria(materia);
                         System.out.println("Materia asignada al profesor!!");
                         break;
                     }
                 case 4:
                     if(profesor.getMaterias() != null){
                        estudiante.llenarEstudiante();
                        estudiante.promedio();
                     }else{
                         System.out.println("El estudiante no tiene asignado una materia");
                     }break;
                 case 5 :
                     if(estudiante != null){
                         materia.agregarEstudiante(estudiante);
                         
                         System.out.println("----Estudiante Asignado----");
                     }else{
                         System.out.println("No hay estudiante");
                         
                     }break;
                             
                     
                 case 6 : 
                     if(profesor != null && materia != null){
                         profesor.mostrarPofesor();
                     }else{
                         System.out.println("Ningun profesor registrado!!");
                     }break;
                 case 7 :
                     System.out.println("-0-0-0-0-0-0-0-0-0-0-");
                     continuar=false;break;
                 default:
                     System.out.println("Opcion no valida!!");
             
             }
         }while(continuar);
        
   
                
      
    }
    
}

