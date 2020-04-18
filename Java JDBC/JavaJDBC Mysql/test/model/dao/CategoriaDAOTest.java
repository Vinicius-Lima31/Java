package model.dao;

import java.sql.SQLException;
import model.bean.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

public class CategoriaDAOTest 
{
    
    public CategoriaDAOTest() 
    {
        
    }
    
    @Test
    public void inserir() 
    {
        
        Categoria cat = new Categoria("Roupas");
        CategoriaDAO dao = new CategoriaDAO();
        
        if(dao.save(cat)){
            System.out.println("Salvo com sucesso!");
        }else{
            fail("Erro ao salvar");
        }
        
    }
    
}
