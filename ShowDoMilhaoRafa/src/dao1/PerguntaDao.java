package dao1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

public class PerguntaDao {
     public Boolean inserir (Pergunta pergunta)
    {
        Boolean retorno;
        String sql = "INSERT INTO pergunta(pergunta, a, b, c, d, certa, nivel) VALUES(?,?,?,?,?,?,?)"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            pst.setString(1, pergunta.getPergunta());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(4, pergunta.getC());
            pst.setString(5, pergunta.getD());
            pst.setString(6, pergunta.getCerta());
            pst.setInt(7, pergunta.getNivel());
            
            pst.executeUpdate();//executa o sql no banco
            retorno = true;         

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Pergunta> listar(){
        List <Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            //Enquanto tiver registro eu vou relacionar com minha classe Jogador e adicionar na lista
            while (res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setId(res.getInt("id"));
                pergunta.setPergunta(res.getString("pergunta"));
                pergunta.setA(res.getString("a"));
                pergunta.setB(res.getString("b"));
                pergunta.setC(res.getString("c"));
                pergunta.setD(res.getString("d"));
                pergunta.setNivel(res.getInt("nivel"));
                pergunta.setCerta(res.getString("certa"));
                lista.add(pergunta);
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return lista;
       }
    public Boolean remover (Pergunta pergunta)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM pergunta WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setInt(1, pergunta.getId());
         
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    
}
