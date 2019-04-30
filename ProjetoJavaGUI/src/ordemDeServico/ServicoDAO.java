package ordemDeServico;
import java.sql.*;
import java.util.*;
/**
 *
 * @author manager
 */
public class ServicoDAO {
    
        private Connection con;
    
    public ServicoDAO(Connection con){
    setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(ServicoBean dados){
        String sql = "INSERT INTO servicos(horainicio,horatermino,atividade,tecnico,tempototal) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
    
            ps.setString(1,dados.getInicio());
            ps.setString(2,dados.getTermino());
            ps.setString(3,dados.getAtividade() );
            ps.setString(4,dados.getTecnico());
            ps.setString(5,dados.getTotal());
                
            if(ps.executeUpdate() >0){
                
            return "inserido com sucesso";
            
            } else{
            return "erro ao inserir";
            }
        }catch(SQLException e){
        return e.getMessage();
        }
    }
  
    
}
