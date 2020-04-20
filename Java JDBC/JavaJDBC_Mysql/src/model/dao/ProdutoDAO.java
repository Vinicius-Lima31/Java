package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection; // <-- sempre importar daqui
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Categoria;
import model.bean.Produto;

public class ProdutoDAO 
{
    private Connection con = null; // Criando ConexÃ£o

    public ProdutoDAO() 
    {
        // Abrindo ja a ConexÃ£o
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Produto produto) 
    {
        String sql = "INSERT INTO produto (descricao, qtd, valor, categoria_id) VALUES (?,?,?,?)"; // <-- "?" SÃ£o quantas coisas iremos passar!
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql); // Passamo o comando SQL
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getQtd());
            // Abaixo, ele estÃ¡ acessando um chave estrangeira, indo de produto.categoria indo atÃ© id da categoria pelo produto
            stmt.setInt(4, produto.getCategoria().getId()); // Minuto 6:30 explica melhor
            stmt.executeUpdate(); // esse porque Ã© responsavel por delete etc..
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
    public List<Produto> findAll() // Vamos usar a Biblioteca List<e> (java.util)
    {
        //String sql = "select p.id as pid, p.descricao as pdesc, qtd, valor, categoria_id, c.id as cid, c.descricao as cdes from produto p inner join categoria c  on c.id = p.categoria_id"; // <-- Nossa Consulta SQL
        // E possivel melhorar esse codigo aqui em cima, fica bem feio dessa largura.
        String sql = "select * from vw_produtocategoria"; // <-- usei essa View, que Ã© a mesma coisa do de cima!
        
        PreparedStatement stnt = null;
        ResultSet rs = null;
        
        // Criando um ArrayList
        List<Produto> produtos = new ArrayList<>(); // criei um objeto chamado categorias, instanciei como um ArrayList
        
        // Precisa os cara dentro do banco e colocarr nessa "list" aqui
        try 
        {
            stnt = con.prepareStatement(sql); // Passamo o comando SQL
            // Na documentacao o "executeQuery" retorna um resultSet
            rs = stnt.executeQuery();
            
            // um While para percorrer
            while(rs.next()) // <---  Percorre o ResultSet
            {
                // categoria == Instancia da Classe Categoria
                // categorias == ArrayList
                
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("pid"));
                produto.setDescricao(rs.getString("pdesc")); // Uma String porque no banco de Dados isso e uma String
                produto.setQtd(rs.getInt("qtd"));
                produto.setValor(rs.getFloat("valor"));
                
                Categoria categoria = new Categoria(); // Precisamos Chamar o "Categoria"
                categoria.setId(rs.getInt("cid"));
                categoria.setDescricao(rs.getString("cdes"));
                
                produto.setCategoria(categoria);
                
                
                produtos.add(produto); // adcionando para a arrayList
            }
        } 
        catch (SQLException ex) // Se der erro, essa aqui é a Excessao
        {
            System.err.println("Erro " + ex);
        }
        finally //Agora vamos fechar a nossa conexao e etc.
        {
            ConnectionFactory.closeConnection(con, stnt, rs);
        }
        
        return produtos; // <--- Retornando uma ArrayList com os valores Adcionados
    }
    
    public boolean update(Produto produto) 
    {
        String sql = "UPDATE produto SET descricao = ?, qtd = ?, valor = ?, categoria_id = ? WHERE id = ?"; // <-- Fazendo Update
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql); // Passamo o comando SQL
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getQtd());
            // Abaixo, ele estÃ¡ acessando um chave estrangeira, indo de produto.categoria indo atÃ© id da categoria pelo produto
            stmt.setInt(4, produto.getCategoria().getId()); // Minuto 6:30 explica melhor
            stmt.setInt(5, produto.getId());
            stmt.executeUpdate(); // esse porque e responsavel por delete etc..
            
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
    public boolean delete(Produto produto) 
    {
        String sql = "DELETE FROM produto WHERE id = ?"; // <-- Passamos o nome da Tabela
        PreparedStatement stmt = null;

        try 
        {
            stmt = con.prepareStatement(sql); // Passamo o comando SQL
            // Acredito eu! Que esses nÃºmeros passados abaixo no "set" seja ordem!
            stmt.setInt(1, produto.getId()); // Passamos o "ID"
            stmt.executeUpdate(); // esse porque Ã© responsavel por delete etc..
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
}
