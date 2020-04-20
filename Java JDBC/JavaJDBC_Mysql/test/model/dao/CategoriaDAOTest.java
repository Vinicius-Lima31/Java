package model.dao;

// JUNIT biblioteca para testes

import java.sql.SQLException;
import model.bean.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CategoriaDAOTest 
{
    
    public CategoriaDAOTest() 
    {
        
    }
    
    @Test // <--- Preciso ter isso aquui
    @Ignore // <--- Feito para Ignorar e nÃ£o executar
    public void inserir() 
    {
        Categoria cat = new Categoria("Comida"); // Tabela categoria do meu banco dados, tera isso incluido
        CategoriaDAO dao = new CategoriaDAO();  // Incluir no banco de dados
        
        // dao.save(cat); <-- Estou acrescentando "Roupas" no meu banco de Dados!
        if(dao.save(cat)) // <-- sera acrescentado
        {
            System.out.println("Salvo com sucesso!");
        }
        else
        {
            fail("Erro ao salvar"); // Se dar uma falha ao salvar virar para aqui!
        }
        
    }
    
    @Test
    @Ignore // <--- Feito para Ignorar e nÃ£o executar
    public void atualizar() 
    {
        Categoria cat = new Categoria("Roupa"); // Tirei um "s" de Roupas, ficando igual a "Roupa"
        cat.setId(1); // Passo o "ID" do Banco de Dados que desejo alterar!
        CategoriaDAO dao = new CategoriaDAO();  // Incluir no banco de dados
        
        // dao.save(cat); <-- Estou acrescentando "Roupas" no meu banco de Dados!
        if(dao.update(cat)) 
        {
            System.out.println("AtualizaÃ§Ã£o realizada com sucesso!");
        }
        else
        {
            fail("Erro ao Atualizar"); // Se dar uma falha ao salvar virar para aqui!
        }
        
    }
    
    // Vamos criar um metodo para Deletar
    @Test
    @Ignore // <--- Feito para Ignorar e nÃ£o executar
    public void deletar()
    {
        Categoria cat = new Categoria();
        cat.setId(1); // <-- Acesso o "ID" 
        
        CategoriaDAO dao = new CategoriaDAO();
        
        if(dao.delete(cat)) // <-- Aqui deleto
        {
            System.out.println("Deletado com Sucesso");
        }
        else
        {
            fail("Erro ao Deletar");
        }
            
    }
    
    // Vamos criar um metodo para listar
    @Test
    @Ignore // <--- Feito para Ignorar e nÃ£o executar
    public void listar()
    {
        CategoriaDAO dao = new CategoriaDAO();
        
        for(Categoria c: dao.findAll()) // Percorrer 
        {
            System.out.println("DescriÃ§Ã£o: " + c.getDescricao());
        }
        // Ira imprimir aqui o que tem no Banco de Dados
        // Exemplo:
        //      DescriÃ§Ã£o: Roupas
    }
    
}
