import modelo.conexao.Conexao;
import modelo.conexao.ConexaoMysql;
import modelo.dominio.Categoria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        // comando SELECT * para busca no sql//
        String sql = "Select * from categoria";

        // Foi feita a conexão com o DataBase, mediante a class ConexaoMysql = parametros para login no SQL//
        Conexao conexao = new ConexaoMysql();

        /* Inserção de NOVA CATEGORIA
        Categoria categoria = new Categoria(null, "Bebida java booooaa");

         utilizar o comando INSERT INTO para Add nova categoria no sql
        String inserirSQL = "INSERT INTO categoria(nome) VALUES(?)";
         Values com apenas 1 "?" devido a unico parametro solicitado de nome

        PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(inserirSQL);

        preparedStatement.setString(1, categoria.getNome());

        // "Resultado no Console Add Categoria"//
        int resultadoDoCadastro = preparedStatement.executeUpdate();
        System.out.println(resultadoDoCadastro);*/

        // Busca da Categoria//
        ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

        // "Resultado no Console Categoria"//
        while (result.next()) {
            System.out.println(result.getString("nome"));
        }
    }
}
