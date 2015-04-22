package Dao;

import Modelo.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafaella
 */
public class PessoaDao {
  

public boolean inserir(Pessoa pes)
    {
      String sql = "INSERT INTO pessoa (id,nome,sexo)"+"VALUES (?,?,?)";
      
    //prepara conexao
 
     try 
     {
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         
          pst.setInt(1,pes.getCod());
          pst.setString(2,pes.getNome());
          pst.setString(3,pes.getSexo());
          
          
          //EXECUTA SQL NO BANCO DE DADOS
         pst.executeUpdate();
         
     }
     catch (Exception ex)
     {
         ex.printStackTrace();
     }
     return false;
    
    }
    public List <Pessoa> Lista()
     {
         List<Pessoa> lista = new ArrayList <Pessoa> ();
         String sql = "SELECT  * FROM Pessoa";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try {
             
         
         ResultSet res = pst.executeQuery();
         //enquanto tiver registro vou relacion ar com minha classe pessoa e adicionar na lista
         while (res.next())
         {
             Pessoa p = new Pessoa();
             p.setCod(res.getInt("id"));
             p.setNome(res.getString("nome"));
             p.setSexo(res.getString("sexo"));
         
             lista.add(p); 
         }
     }catch (SQLException ex){
            ex.printStackTrace();
}
     return lista;
     
     }  
    
    public static Boolean excluir(Pessoa pessoa) {
        Boolean retorno;
        
        String sql = "DELETE FROM pessoa WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setInt(1, pessoa.getCod());
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
