package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection; // <-- sempre importar daqui
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Produto;

public class ProdutoDAO 
{
    private Connection con = null; // Criando Conexão

    public ProdutoDAO() 
    {
        // Abrindo ja a Conexão
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Produto produto) 
    {
        String sql = "INSERT INTO produto (descricao, qtd, valor, categoria_id) VALUES (?,?,?,?)"; // <-- "?" São quantas coisas iremos passar!
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getQtd());
            // Abaixo, ele está acessando um chave estrangeira, indo de produto.categoria indo até id da categoria pelo produto
            stmt.setInt(4, produto.getCategoria().getId()); // Minuto 6:30 explica melhor
            stmt.executeUpdate(); // esse porque é responsavel por delete etc..
            return true;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        }
        finally // fechando Conexão, o finnally passa sempre, mesmo quando passa por try ou catch
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
}
