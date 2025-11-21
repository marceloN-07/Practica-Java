/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Materia {
private String NRC;
private String nombre;
private int horas;
private String carrera;

Scanner sc = new Scanner(System.in);
private ArrayList<Estudiante> estudiantes = new ArrayList();

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }



    public String getNRC() {
        return NRC;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Metodos
    public void registrarMateria(){
        System.out.println("Ingrese el NRC: ");
        NRC = sc.nextLine();
        System.out.println("Ingrese la materia: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese las horas: ");
        horas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la carrera: ");
        carrera = sc.nextLine();
           
        System.out.println("-------REGISTRO COMPLETADO--------");
    }
    public void mostrar(){
        System.out.println("NRC: "+NRC);
        System.out.println("Materia: "+nombre);
        System.out.println("Horas: "+horas);
        System.out.println("Carrera: "+carrera);
        System.out.println("-------------");
       
    } 
   public void agregarEstudiante(Estudiante estudiante){
    estudiantes.add(estudiante);
}
    public void Estudiante(){
        if (estudiantes != null){
           System.out.println("----Estudiante Asignado----");
           for(Estudiante est:estudiantes){
               est.mostrarEstudiante();
               System.out.println("-o-o-o-o-o-o-o-");
           }
    }else{
           System.out.println("La materia no tiene estudiante");
       }
    }

}
