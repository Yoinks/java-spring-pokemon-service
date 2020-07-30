package pokemans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class PokemanService {

    @Autowired
    DataSource dataSource;

    @GetMapping
    public String hello(){
        JdbcTemplate template = new JdbcTemplate(dataSource);

        return "Hello";
    }

    @PostMapping
    public void CreatePokeman(){
        JdbcTemplate template = new JdbcTemplate(dataSource);

    }
}
