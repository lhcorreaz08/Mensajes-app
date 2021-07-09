import java.sql.*;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args){

        System.out.println("Hola APP");

        try
        {
            // create a mysql database connection
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mensaje_app", "luis", "tensorflow86");

            Statement st = connection.createStatement();

            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO mensajes (mensaje, autor_mensaje) VALUES ('F', 'Flinstone')");

            connection.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }



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
