package ordemDeServico;

import estacionamento.conexao;

public class Teste {
    public static void main(String[] args) {
        ConexaoBD.abrirConexao();
        ConexaoBD.fecharConexao(conexao.abrirConexao());
        
    }
}
