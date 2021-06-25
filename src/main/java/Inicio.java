import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args){

        System.out.println("Hola APP");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("-----------------------");
            System.out.println("Aplicación mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensaje");
            System.out.println("5. Salir");

            //Lectura de opción
            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.editMensaje();
                    break;

                case 4:
                    MensajesService.borrarMensaje();
                    break;

                default:
                    break;

            }


        }while(opcion!=5);





    }

}
