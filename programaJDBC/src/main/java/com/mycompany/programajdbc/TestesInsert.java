/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programajdbc;

import java.util.Date;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aluno
 */
public class TestesInsert {

    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bandtec?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("bandtec");

        // objeto de operação com o banco
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        jdbcTemplate.update("insert into gaga (origem,valor) values ('cpu', 80)");
        String origemInsert = "memoria ram";
        double valorInsert = 2.5;
        Date dataHoraInsert = new Date(10_000L);
//
//        jdbcTemplate.update("insert into gaga (origem,valor,data_hora) values (?,?,?)",
//                origemInsert, valorInsert, dataHoraInsert);

        jdbcTemplate.update("update gaga set data_hora = ? where data_hora is null", dataHoraInsert);

    }

}
