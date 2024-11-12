package com.yash.capp.test;

import com.yash.capp.config.SpringRootConfig;
import com.yash.capp.dao.UserDAO;
import com.yash.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOUpdate {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from update user profile page.

        User u = new User();
        u.setUserId(1);
        u.setName("Vaishnavi Rathore");
        u.setPhone("1234567899");
        u.setEmail("vaishnavi.rathore@yash.com");
        u.setAddress("Indore");
        u.setRole(1); //admin role
        u.setLoginStatus(1); //Active

        userDAO.update(u);
        System.out.println("------Data Updated-------");

    }
}
