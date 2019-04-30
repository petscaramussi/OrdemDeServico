package ordemDeServico;
import java.sql.*;
import java.util.*;
import java.util.Date;
public class OrdemDeServicoDAO {

    private Connection con;
    
    public OrdemDeServicoDAO(Connection con){
    setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
public String ODS(DadosClientesBean dados,ServicoBean servico){
String sql = "insert into ordemServico values(0,?,?,?,?)";
try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            Date data = new Date(System.currentTimeMillis());
            String sdata = data.toString();
            
            ps.setString(1,sdata);
            ps.setString(2, servico.getAtividade());
            ps.setString(3, dados.getNome());
            ps.setString(4, dados.getEndereco());
            
            
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
