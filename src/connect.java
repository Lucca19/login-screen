import java.sql.*;

public class connect {

    public static String status = "Não conectou...";

    public connect() {   
    }

    public static java.sql.Connection getConexaoMySQL() {

        Connection connection = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";
            
            Class.forName(driverName);
            String serverName = "127.0.0.1/3306";    //caminho do servidor do BD

            String mydatabase ="unifil";        //nome do seu banco de dados
    
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    
            String username = "root";
    
            String password = "rafaela1903";
    
            connection = DriverManager.getConnection(url, username, password);
    
    
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
            
            }catch (ClassNotFoundException e) {

                System.out.println("O driver expecificado nao foi encontrado.");
    
                return null;
    
            } catch (SQLException e) {

    
                System.out.println("Nao foi possivel conectar ao Banco de Dados.");
    
                return null;
    
            }
    
    
    
        }
    
        }