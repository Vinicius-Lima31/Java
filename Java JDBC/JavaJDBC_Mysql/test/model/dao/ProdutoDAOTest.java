package model.dao;

import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ProdutoDAOTest 
{
    
    public ProdutoDAOTest() 
    {
        
    }

    @Test
    @Ignore
    public void inserir() // Inserindo com chave estrangeira
    {
        Categoria categoria = new Categoria();
        categoria.setId(3); // Esse ID Ã© o ID do Banco de Dados, id da para a Chave Estrangeira
        
        Produto produto = new Produto();
        produto.setDescricao("Farinha"); // Adcionando esses Atributos
        produto.setQtd(40);            // Adcionando esses Atributos
        produto.setValor(20);          // Adcionando esses Atributos
        produto.setCategoria(categoria); // Preenchendo chave Estrangeira
        
        ProdutoDAO dao = new ProdutoDAO();
        
        if(dao.save(produto)) // <-- Salvando, inserindo.
        {
            System.out.println("Salvo Com Sucesso!");
        }
        else
        {
            fail("Erro ao Salvar!");
        }
    }
    
    @Test
    //@Ignore
    public void listar()
    {
        ProdutoDAO dao = new ProdutoDAO();
        
        for(Produto p: dao.findAll())
        {
            System.out.println("Descricao Produto: " + p.getDescricao() + " - Descricao Categoria: " + p.getCategoria().getDescricao());
            // Quando eu for listar basta eu imprimir usando metodos get, igual acima!
        }
            
    }
    
    @Test
    @Ignore
    public void atualizar() // Inserindo com chave estrangeira
    {
        Categoria categoria = new Categoria();
        categoria.setId(1); // Esse ID Ã© o ID do Banco de Dados
        
        Produto produto = new Produto();
        produto.setDescricao("Farinha"); // Adcionando esses Atributos
        produto.setQtd(15);            // Adcionando esses Atributos
        produto.setValor(6);          // Adcionando esses Atributos
        produto.setCategoria(categoria); // Preenchendo chave Estrangeira
        
        produto.setId(3); // <-- esse e quem eu quero alterar
        
        ProdutoDAO dao = new ProdutoDAO();
        
        if(dao.update(produto)) // <-- Salvando, inserindo.
        {
            System.out.println("Atualizado Com Sucesso!");
        }
        else
        {
            fail("Erro ao atualizar!");
        }
    }
    
    @Test
    @Ignore // <--- Feito para Ignorar e nÃ£o executar
    public void deletar()
    {
        Produto prod = new Produto();
        prod.setId(3); // <-- Acesso o "ID" 
        
        ProdutoDAO dao = new ProdutoDAO();
        
        if(dao.delete(prod)) // <-- Aqui deleto
        {
            System.out.println("Deletado com Sucesso");
        }
        else
        {
            fail("Erro ao Deletar");
        }
            
    }
}
