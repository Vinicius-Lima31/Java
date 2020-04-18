package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Categoria;

public class CategoriaDAO 
{

    private Connection con = null; // iremos iniciar com nullo

    public CategoriaDAO() // Criar um Constructor
    {
        con = ConnectionFactory.getConnection(); //passando Conexão para con
    }

    public boolean save(Categoria categoria) 
    {

        String sql = "INSERT INTO categoria (descricao) VALUES (?)";
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate(); // esse porque é responsavel por delete etc..
            return true;
        } catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        } finally // fechando Conexão, o finnally passa sempre, mesmo quando passa por try ou catch
        {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
