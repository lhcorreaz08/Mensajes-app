import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mensaje_app", "luis", "tensorflow86");
            System.out.println("Conexión exitosa! ");

        }catch(SQLException e){
            System.out.println(e);
        }

        return connection;


    }


}
