package service;

import domain.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultsService {

    @Autowired
    private JdbcTemplate jtm;

    public List<Results> findAll() {
        String sql = "SELECT * FROM RESULTS";
        List<Results> results = jtm.query(sql, new BeanPropertyRowMapper<Results>(Results.class));
        return results;
    }
}
