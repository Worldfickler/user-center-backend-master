package com.example.usercenterbackendmaster.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author dell
 * @date 2023/3/16 9:49
 */

@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 6010448209356722607L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;

}
