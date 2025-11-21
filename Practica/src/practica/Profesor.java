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
public class Profesor {
    private int id;
    private String nombre;
    private String apellido;
    private String departamento;

    Scanner sc = new Scanner(System.in);
    private ArrayList<Materia> materias = new ArrayList<>();

    
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void registrarProfesor(){
        System.out.println("Ingrese su ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese su Departamento: ");
        departamento = sc.nextLine();
        System.out.println("-----REGISTRO COMPLETADO------");
            
    }
    public void mostrarPofesor(){
        System.out.println("----Profesor----");
        System.out.println("ID: "+id);
        System.out.println("Nombre: " +nombre );
        System.out.println("Apellido: "+apellido);
        System.out.println("Departamento: "+departamento);
    
    if(materias!= null){
        System.out.println("----Materias asignadas----");
        
        for(Materia mat : materias){
            System.out.println("-----------------");
            mat.mostrar();
            mat.Estudiante();
            System.out.println("-----------------");
            
        }
    }else{
        System.out.println("No tiene materias!!");
        
    }
     
    }
    public void agregarMateria(Materia materia){
        materias.add(materia);
       
    }
}
