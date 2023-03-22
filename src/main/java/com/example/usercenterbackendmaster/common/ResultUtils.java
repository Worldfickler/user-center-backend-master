package com.example.usercenterbackendmaster.common;

/**
 * 返回工具类
 * @author dell
 * @date 2023/3/22 10:12
 */
public class ResultUtils {

    /**
     * 成功
     * @param data 返回值
     * @return
     * @param <T> 泛型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode 错误代码
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new  BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code 错误代码
     * @param message 错误信息
     * @param description 错误描述
     * @return
     */
    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse(code, null, message, description);
    }

    /**
     * 失败
     * @param errorCode 错误代码
     * @param message 错误信息
     * @param description 错误描述
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message, String description) {
        return new BaseResponse(errorCode.getCode(), null, message, description);

    }

    /**
     * 失败
     * @param errorCode 错误代码
     * @param description 错误信息
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String description) {
        return new BaseResponse(errorCode.getCode(), errorCode.getMessage(), description);
    }

}
