package ordemDeServico;
import java.sql.*;
public class ConexaoBD {
    public static Connection abrirConexao(){
        Connection con = null;
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        String url = "";
        url += "jdbc:mysql://127.0.0.1/gerenciamento?";
        url += "user=root&password=";

        con = DriverManager.getConnection(url);

            System.out.println("Conexão aberta.");

        //caso a conexão não funcione, mostrara o erro
        }catch(SQLException e ){
            System.out.println("erro");
            System.out.println(e.getMessage()); 
        }
        catch(ClassNotFoundException e){
            System.out.println("erro");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("erro");
            System.out.println(e.getMessage());
        }

        return con;
    }
    
    public static void fecharConexao(Connection con){
        try{
        con.close();

            System.out.println("Conexão fechada.");
        }
        catch(SQLException e ){
            System.out.println(e.getMessage()); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
}

