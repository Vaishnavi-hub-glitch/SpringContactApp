package com.yash.capp.test;

import com.yash.capp.config.SpringRootConfig;
import com.yash.capp.dao.UserDAO;
import com.yash.capp.domain.User;
import com.yash.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserServiceRegister {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService = ctx.getBean(UserService.class);

        User u = new User();
        u.setName("admin");
        u.setPhone("8770602070");
        u.setEmail("admin@yash.com");
        u.setAddress("indore");
        u.setLoginName("admin");
        u.setPassword("admin123");
        u.setRole(UserService.ROLE_ADMIN);//admin role
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
        userService.register(u);
        System.out.println("------User Registered Successfully-------");

    }
}
