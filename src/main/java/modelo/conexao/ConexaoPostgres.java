package modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoPostgres implements Conexao{
    @Override
    public Connection obterConexao() throws SQLException {
        return null;
    }
}
