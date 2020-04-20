package model.dao;

import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoDAOTest 
{
    
    public ProdutoDAOTest() 
    {
        
    }

    @Test
    public void inserir() // Inserindo com chave estrangeira
    {
        Categoria categoria = new Categoria();
        categoria.setId(2); // Esse ID é o ID do Banco de Dados
        
        Produto produto = new Produto();
        produto.setDescricao("Arroz");
        produto.setQtd(20);
        produto.setValor(10);
        produto.setCategoria(categoria); // Preenchendo chave Estrangeira
        
        ProdutoDAO dao = new ProdutoDAO();
        
        if(dao.save(produto))
        {
            System.out.println("Salvo Com Sucesso!");
        }
        else
        {
            fail("Erro ao Salvar!");
        }
    }
    
}
