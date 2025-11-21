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
public class Materia {
    private String NRC; 
    private String nombre; 
    private int horas;
    private String carrera;

    public Materia() {
    }

    public Materia(String NRC, String nombre, int horas, String carrera) {
        this.NRC = NRC;
        this.nombre = nombre;
        this.horas = horas;
        this.carrera = carrera;
    }
 Scanner sc= new Scanner(System.in);
    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void registrarMateria(){
        System.out.print("Ingrese el NRC de su materia");
        NRC = sc.nextLine();
        System.out.print("Ingrese el nombre de la materia");
        nombre = sc.nextLine();
        System.out.print("Ingrese el las horas de la materia");
        horas = sc.nextInt();
        System.out.print("Ingrese la carrera");
        NRC = sc.nextLine();
    }
    
    public void mostrar(){
        System.out.println("NRC: "+NRC+"\nNombre: "+nombre+"\nHoras de la materia: "+horas+"\nCarrera: "+carrera);
    }
    public void agregarEstudiante(){
          
        estudiantes.add(estudiante);
}

