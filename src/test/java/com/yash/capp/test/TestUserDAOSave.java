package com.yash.capp.test;

import com.yash.capp.config.SpringRootConfig;
import com.yash.capp.dao.UserDAO;
import com.yash.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOSave {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);

        User u = new User();
        u.setName("pakhi");
        u.setPhone("8770602070");
        u.setEmail("pakhi@yash.com");
        u.setAddress("indore");
        u.setLoginName("pakhi");
        u.setPassword("pakhi@2001");
        u.setRole(2);//general user role
        u.setLoginStatus(1);
        userDAO.save(u);
        System.out.println("------Data Saved Successfully-------");

    }
}
