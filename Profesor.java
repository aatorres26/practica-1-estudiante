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
public class Profesor {
     Scanner sc= new Scanner(System.in);
     private int id;
     private String nombre;
     private String apellido;
     private String departamento;
     private Materia materia;

    public Profesor(int id, String nombre, String apellido, String departamento, Materia materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.materia = materia;
    }

     
    public Profesor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
     
     public void registrarProfesor(){
         System.out.print("Ingrese el id del profesor: ");
         id=sc.nextInt();
         System.out.print("Ingrese nombre del profesor: ");
         nombre=sc.nextLine();
         System.out.print("Ingrese apellido del profesor: ");
         apellido=sc.nextLine();
         System.out.print("Ingrese el departamento del profesor: ");
         departamento=sc.nextLine();
     }
     public void mostrarProfesor(){
         System.out.println("id: "+id+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nDepartamento"+departamento);
         if (materia!=null){
             materia.mostrar();           
         }else{
             System.out.println("Sin materia asignada");
         }
     }
     public void agregarMateria(Materia materia){
         
     }
}
