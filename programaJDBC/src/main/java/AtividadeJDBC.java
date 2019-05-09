
import com.mycompany.programajdbc.Leitura;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class AtividadeJDBC {

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://serversoft7.database.windows.net:1433;"
                + "database=SevenSoft;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("ninja");
        dataSource.setPassword("@Sevensoft");

        // objeto de operação com o banco
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //select no banco
        List<Map<String, Object>> select = jdbcTemplate.queryForList("select * from software");

        for (Map linha : select) {
            System.out.println(linha);
        }

        // excluir
//        String idSOft = "35";
//        int update = jdbcTemplate.update("delete from software where id_soft = ? ", idSOft);
    }

}
