package ordemDeServico;
import java.sql.*;
import java.util.*;
public class EquipamentoDAO {
    private Connection con;
    
    public EquipamentoDAO(Connection con){
    setCon(con);
    }
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(EquipamentoBean dados){
        String sql = "INSERT INTO equipamento(equipamentos,justificativa,defeito,observacoes) VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
           
            
            ps.setString(1,dados.getEquipamento());
            ps.setString(2,dados.getJustificativa());
            ps.setString(3, dados.getDefeito());
            ps.setString(4, dados.getObservacoes());
            
            
                
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
