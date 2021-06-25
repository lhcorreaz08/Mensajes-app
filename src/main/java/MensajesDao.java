import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MensajesDao {


    public static void crearMensajeDB(Mensajes mensajes){

        Conexion dbConnect = new Conexion();
        try(Conexion conexion = dbConnect.get_connection()){
            PreparedStatement p = null;
            try(){
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (Que Onda, Luis Correa, CURRENT_TIMESTAMP)";
                //EStas
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void leerMensajeDB(){

    }


    public static void borrarMensajeDB(int idMensaje){

    }

    public static void actualizarMensajeDB(Mensajes mensajes){

    }

}
