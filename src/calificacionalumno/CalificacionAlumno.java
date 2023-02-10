/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionalumno;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jimmy
 */
public class CalificacionAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner reader = new Scanner(System.in);
        double nota;
        int opcion = 0;
        
        
        //Digite:JoptionPane.showInputDialog("Digite la nota");
        System.out.println("Digite la nota a verificar");
        nota = reader.nextDouble();
     
        if(nota>=7 && nota<=10 ) {
         opcion = 1;           
                    }
        
        if(nota>=6.50 & nota<=6.99 ){
            opcion = 2;
                              }
        if(nota>=0 && nota <=6.49 ){
        opcion =3;
                                    }
        
        
        
        try{
            switch (opcion) {

      case 1:

        System.out.println("Aprobado");
        System.exit(0);
        break;

      case 2:

        System.out.println("Es candidato a realizar un examen de suficiencia para aprobar");

        break;
        case 3:

        System.out.println("Reprobado");

        break;

     default: System.out.println("Agregue una nota");


        
                            }
            }   
        catch (Exception e){}
        
        
        
        
       
        
        
    
    
    }
    
}
