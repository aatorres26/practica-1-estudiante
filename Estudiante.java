/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprofesor;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Estudiante {
    private String nombre;
    private String id;
    private double nota;
    private String estado;
Scanner sc= new Scanner(System.in);
    public Estudiante() {
               
    }

    public Estudiante(String nombre, String id, double nota, String estado) {
        this.nombre = nombre;
        this.id = id;
        this.nota = nota;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void registrarEstudiante(){
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre= sc.nextLine();
        System.out.print("Ingrese el id del estudiante: ");
        id= sc.nextLine();
        System.out.print("Ingrese la nota del estudiante: ");
        nota= sc.nextInt();
    }
    public void mostrarEstudiante(){
        System.out.print("nombre"+nombre+"\nid"+id+"\nnota del estudiante: "+nota+"\nestado"+estado);
    }
    
    public void pasado(){
        if(nota>=14){
            estado="pasa la materia";
        }else{
            estado="no pasa la materia";
        }
    }
    
}
