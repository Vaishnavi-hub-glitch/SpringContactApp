package com.yash.capp.test;

import com.yash.capp.config.SpringRootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
public class TestDataSource {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);

        // Corrected SQL statement with VALUES clause
        String sql = "INSERT INTO user(`name`, `phone`, `email`, `address`, `loginName`, `password`) VALUES (?, ?, ?, ?, ?, ?)";

        // Parameters to insert
        Object[] param = new Object[]{"vaishnavi", "23676676676", "vaishnavi@gmail.com", "indore", "v", "v123"};

        // Execute the update
        jt.update(sql, param);

        System.out.println("--------SQL executed-------");
    }
}