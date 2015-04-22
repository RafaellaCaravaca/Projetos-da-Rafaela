package Dao;

import Modelo.Cidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafaella
 */
public class CidadeDao {
    

public static boolean inserir(Cidade cid)
    {
      String sql = "INSERT INTO cidade (id,nome)"+"VALUES (?,?)";
      
    //prepara conexao
 
     try 
     {
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
          pst.setString(2,cid.getNome());
          pst.setInt(1,cid.getCod());/**/
          
          //EXECUTA SQL NO BANCO DE DADOS
         pst.executeUpdate();
         
     }
     catch (Exception ex)
     {
         ex.printStackTrace();
     }
     return false;
    
    }
    public static List <Cidade> Lista()
     {
         List<Cidade> lista = new ArrayList <Cidade> ();
         String sql = "SELECT  * FROM cidade";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try {
             
         
         ResultSet res = pst.executeQuery();
         //enquanto tiver registro vou relacion ar com minha classe cidade e adicionar na lista
         while (res.next())
         {
             Cidade c = new Cidade();
             c.setCod(res.getInt("id"));
             c.setNome(res.getString("nome"));
         
             lista.add(c); 
         }
     }catch (SQLException ex){
            ex.printStackTrace();
}
     return lista;
     
     }
    
    public static Boolean excluir(Cidade cidade) {
        Boolean retorno;
        
        String sql = "DELETE FROM cidade WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setInt(1, cidade.getCod());
            pst.executeUpdate();
            retorno = true;
        }
        
        catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    } 
    
}
