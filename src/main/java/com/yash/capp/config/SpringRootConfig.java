package com.yash.capp.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.yash.capp.dao","com.yash.capp.service"})
public class SpringRootConfig {
    @Bean
    public BasicDataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/contactappdb");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setMaxTotal(2); // maximum no. of active connection allocated at same time in connection pool
        ds.setInitialSize(1); //initial no. of connection when the pool is started
        ds.setTestOnBorrow(true); //This helps ensure that the connections are valid and can be used.
        ds.setValidationQuery("SELECT 1");
        ds.setDefaultAutoCommit(true);//This line sets the default auto-commit behavior for connections obtained from the pool. Setting it to true means that each SQL statement will be committed automatically without needing to call commit() explicitly.
        return ds;
    }
}
