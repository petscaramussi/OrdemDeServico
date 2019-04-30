package ordemDeServico;
import java.sql.*;
import java.util.*;
public class DadosClientesDAO {
    private Connection con;
    
    public DadosClientesDAO(Connection con){
    setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(DadosClientesBean dados){
        String sql = "INSERT INTO dadoscliente(id,nome,telefone,endereco,bairro,cidade,uf,cep) VALUES(?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setInt(1, dados.getId());
            ps.setString(2,dados.getNome() );
            ps.setString(3,dados.getTelefone() );
            ps.setString(4,dados.getEndereco() );
            ps.setString(5,dados.getBairro());
            ps.setString(6,dados.getCidade());
            ps.setString(7,dados.getUf());
            ps.setString(8,dados.getCep());
            
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
