package com.example.usercenterbackendmaster.service;

import com.example.usercenterbackendmaster.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author dell
 * @date 2023/3/13 15:14
 */

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {

        User user = new User();
        user.setUsername("test");
        user.setUserAccount("123");
        user.setAvatarUrl("http://qzapp.qlogo.cn/qzapp/101983660/DE2DFA542010DAD2696FC2082D1EE3E7/100");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setEmail("123");
        user.setPhone("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "planet";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "123";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
        Assertions.assertEquals(-1, result);
    }
}