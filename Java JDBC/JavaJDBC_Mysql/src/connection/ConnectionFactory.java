package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory 
{
    // Tenho que criar metódos estaticos
    private static final String DRIVER = "com.mysql.jdbc.Driver"; // <----- vamos estar carregando o Driver.class
    private static final String URL = "jdbc:mysql://localhost:3306/dbloja"; // Banco de Dados que tou trabalhando
    private static final String USER = "root";
    private static final String PASS = "";
    
    // Vamos criar o metodo pra pegar a conexão
    
    public static Connection getConnection() // Essa aqui é nossa Classe de Conexão
    {
        try 
        {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } 
        catch (ClassNotFoundException | SQLException ex) // Fluxo de Exceção
        {
            // Vamos lançar uma exceção aqui
            // Ira mostrar o Erro
            throw new RuntimeException("Erro na conexão", ex); // Imprimir erro
        }
        
    }
    
    // Vamos Criar um Método para fechar a Conexão
    public static void closeConnection(Connection con)
    {
        if(con != null) // Quer dizer que tem algo ae
        {
            try 
            {
                con.close(); // Fechando a Conexão
            } 
            catch (SQLException ex) // Caso esteja nulo, ira para o fluxo de exceção
            {
                System.err.println("Erro: "+ex); // "err" é para aparecer em vermelho
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) // Vamos fazer uma Sobrecarga aqui
    {
        
        if(stmt != null) // Quer dizer que tem algo ae
        {
            try 
            {
                stmt.close(); // Fechando o Statement
            } 
            catch (SQLException ex) 
            {
                 System.err.println("Erro: "+ex); // "err" é para aparecer em vermelho
            }
        }
        closeConnection(con); // Fechando o con
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) // Vamos fazer uma Sobrecarga
    {
        
        if(rs != null) // Quer dizer que tem algo ae
        {
            try 
            {
                rs.close(); // Fechando o Statement
            } 
            catch (SQLException ex) 
            {
                 System.err.println("Erro: "+ex); // "err" é para aparecer em vermelho
            }
        }
        closeConnection(con, stmt); // Fechando o conexão, no caso eu preciso fechar os 2, e não só 1
    }
    
}
