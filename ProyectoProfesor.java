/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprofesor;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ProyectoProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
         Profesor profesor= new Profesor();
         Materia materia= new Materia();
         boolean continuar = true;
        
        do{
        System.out.println("\n-------MENU DE OPCIONES----------");
            System.out.println("1: crear profesor");
            System.out.println("2: crear materia");
            System.out.println("3: asignar materia");
            System.out.println("4: mostrar profesor ");
            System.out.print("digite opcion: ");
            int op=sc.nextInt();
            sc.nextLine();
            switch(op){
               case 1: 
                   profesor.registrarProfesor();break;
               case 2:
                   materia.registrarMateria();break;
               case 3:
                   if(profesor.getApellido()!=null && materia.getCarrera()!=null ){
                       System.out.println("se agrego la materia");
                       
                   }break;
               case 4:
               
               if (profesor!=null){
                   profesor.mostrarProfesor();
               }else{
                   System.out.println("no se registro a ninguno profesor");
               }break;
               default:
                   continuar =false;
                   break;
            }
    }while(continuar);           
        }        
    
}
