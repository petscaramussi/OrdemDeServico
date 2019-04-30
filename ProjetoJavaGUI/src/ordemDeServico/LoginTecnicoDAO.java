package ordemDeServico;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
public class LoginTecnicoDAO {

public void ControleLogin(String nome,String senha){

    if(nome.equals("") || senha.equals("")){    
        JOptionPane.showMessageDialog(null,"Os campos de login e senha não podem ser deixados em branco.");
    }
    else{
        try{
        
        }catch(Exception e){
            
        }
    }
    
}
}
