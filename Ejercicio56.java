import java.util.Scanner;

public class Ejercicio56{
    public static void main( String args[]){
        
        Scanner leer = new Scanner (System.in);
        int aprobados= 0;
        int reprobados= 0;
        System.out.println("digite la cantidad de estudiantes");

        int estudiantes = leer.nextInt();
    

        for (int i=0; i <= estudiantes; i++);
        System.out.print("ingrese las notas de el estudiante: ");

        int not = leer.nextInt();

        if(not>=5){
            aprobados++;
        }else{
            reprobados++;
        }
        System.out.println("los aprobados son "+ aprobados + " y los reprobados son "+ reprobados);
    }
}