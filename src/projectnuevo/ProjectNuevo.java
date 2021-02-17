package projectnuevo;

import java.util.Scanner;

public class ProjectNuevo {
    public static void main(String[] args) {
      int Op=0;
        Scanner Usu = new Scanner(System.in);
        do {
            System.out.println("Menu"
                    + "\n1.-Tabla de multiplica"
                    + "\n2.- Promedio de 3"
                    + "\n3.Calculo del area del circulo"
                    + "\n4.-Mayor de 2"
                    + "\n5.-Salir");
                Op=Usu.nextInt();
            switch(Op){
                case 1:
                    System.out.println("Tabla");
                    break;
                case 2:
                    System.out.println("Promedio");
                    break;
                case 3:
                    System.out.println("Area");
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }while (Op != 4);
    }
    
}
