package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Categoria;

public class CategoriaDAO 
{

    private Connection con = null; // iremos iniciar com nullo

    public CategoriaDAO() // Criar um Constructor
    {
        con = ConnectionFactory.getConnection(); //passando Conexão para "con"
    }

    
    // MetÃ³do Inserir
    public boolean save(Categoria categoria) 
    {
        String sql = "INSERT INTO categoria (descricao) VALUES (?)";
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql); // Passamo o comando SQL
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate(); // esse porque é responsavel por delete etc..
            return true;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        }
        finally // fechando ConexÃ£o, o finnally passa sempre, mesmo quando passa por try ou catch
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    // Aqui faremos o UPDATE
    public boolean update(Categoria categoria) 
    {
        String sql = "UPDATE categoria SET descricao = ? WHERE id = ?"; // <-- Passamos o nome da Tabela
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql);
            // Acredito eu! Que esses parametros passados abaixo no "set" seja ordem!
            stmt.setString(1, categoria.getDescricao()); // Passamos a "Descricao"
            stmt.setInt(2, categoria.getId()); // Passamos o "ID"
            stmt.executeUpdate(); // esse porque é responsavel por delete etc..
            return true;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        }
        finally // fechando Conexao, o finnally passa sempre, mesmo quando passa por try ou catch
        {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    // Deletar
    public boolean delete(Categoria categoria) 
    {
        String sql = "DELETE FROM categoria WHERE id = ?"; // <-- Passamos o nome da Tabela
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql); // Passamo o comando SQL
            // Acredito eu! Que esses nÃºmeros passados abaixo no "set" seja ordem!
            stmt.setInt(1, categoria.getId()); // Passamos o "ID"
            stmt.executeUpdate(); // esse porque é responsavel por delete etc..
            return true;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro: " + ex);
            return false;
        }
        finally // fechando ConexÃ£o, o finnally passa sempre, mesmo quando passa por try ou catch
        {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    // Vamos retornar uma lista passando categoria como parametros, metodo chamado de findAll
    public List<Categoria> findAll() // Vamos usar a Biblioteca List<e> (java.util)
    {
        String sql = "SELECT * FROM categoria";
        
        PreparedStatement stnt = null;
        ResultSet rs = null;
        
        // Criando um ArrayList
        List<Categoria> categorias = new ArrayList<>(); // criei um objeto chamado categorias, instanciei como um ArrayList
        
        // Precisa os cara dentro do banco e colocarr nessa "list" aqui
        try 
        {
            stnt = con.prepareStatement(sql); // Passamo o comando SQL  
            // Na documentaÃ§Ã£o o "executeQuery" retorna um resultSet
            rs = stnt.executeQuery();
            
            // um While para percorrer
            while(rs.next()) // <---  Percorre o ResultSet
            {
                // categoria == Instancia da Classe Categoria
                // categorias == ArrayList
                
                Categoria categoria = new Categoria();
                
                categoria.setDescricao(rs.getString("descricao")); // Uma String porque no banco de Dados isso é uma String
                categorias.add(categoria); // adcionando para a arrayList
                
                
            }
        } 
        catch (SQLException ex) // Se der erro, essa aqui é a Exceção
        {
            System.err.println("Erro " + ex);
        }
        finally //Agora vamos fechar a nossa conexao e etc.
        {
            ConnectionFactory.closeConnection(con, stnt, rs);
        }
        
        return categorias; // <--- Retornando uma ArrayList com os valores Adcionados
    }
}
