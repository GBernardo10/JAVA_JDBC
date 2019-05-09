/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programajdbc;

import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aluno
 */
public class Teste {

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bandtec?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("bandtec");

        // objeto de operação com o banco
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //System.out.println(jdbcTemplate.queryForList("select * from gaga"));
//        List<Map<String, Object>> lista = jdbcTemplate.queryForList("select * from gaga");
//        
////        System.out.println(lista);
//
//        for (Map linha : lista) {
//            System.out.println(linha);
//        }
//        List<Leitura> lista = jdbcTemplate.query("select * from gaga",
//                new BeanPropertyRowMapper<Leitura>(Leitura.class));
//        System.out.println(lista);

//        List<Leitura> lista = jdbcTemplate.query("select * from gaga where id > ?",
//                new BeanPropertyRowMapper<Leitura>(Leitura.class), 2);
//
//        for (Leitura linha : lista) {
//            System.out.println(linha);
//        }
        //System.out.println(lista);
//        List<Leitura> lista = jdbcTemplate.query("select * from gaga where id > ? and origem = ?",
//                new BeanPropertyRowMapper<Leitura>(Leitura.class), 0, "cpu");
//        
//        System.out.println(lista);
        List<Leitura> lista = jdbcTemplate.query("select * from gaga ",
                new BeanPropertyRowMapper<Leitura>(Leitura.class));

        for (Leitura linha : lista) {
            System.out.println(linha);
        }
    }
}
