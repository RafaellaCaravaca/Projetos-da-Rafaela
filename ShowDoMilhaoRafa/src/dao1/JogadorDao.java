/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Jogador;

/**
 *
 * @author User
 */
public class JogadorDao {
    public static boolean inserir(Jogador jog)
    {
      String sql = "INSERT INTO jogador (login,email,senha,id)"+"VALUES (?,?,?,?)";
      
    //prepara conexao
 
     try 
     {
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
          pst.setString(1,jog.getLogin());/**/
          pst.setString(2,jog.getEmail());
          pst.setString(3,jog.getSenha());
           pst.setInt(4,jog.getId());//eu usei BIGINT no banco
         
          //EXECUTA SQL NO BANCO DE DADOS
         pst.executeUpdate();
         
     }
     catch (Exception ex)
     {
         ex.printStackTrace();
     }
     return false;
    
    }
        public static List <Jogador> Lista()
     {
         List<Jogador> lista = new ArrayList <Jogador> ();
         String sql = "SELECT  * FROM jogador";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try {
             
         
         ResultSet res = pst.executeQuery();
         //enquanto tiver registro vou relacion ar com minha classe cidade e adicionar na lista
         while (res.next())
         {
             Jogador c = new Jogador();
             c.setId(res.getInt("id"));
             c.setLogin(res.getString("login"));
             c.setEmail(res.getString("email"));
             c.setSenha(res.getString("senha"));
         
             lista.add(c); 
         }
     }catch (SQLException ex){
            ex.printStackTrace();
}
     return lista;
     
     }
   public static Boolean excluir(Jogador jogador) {
        Boolean retorno;
        
        String sql = "DELETE FROM cidade WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setInt(1, jogador.getId());
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
