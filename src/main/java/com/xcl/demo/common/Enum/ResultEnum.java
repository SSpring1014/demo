package com.xcl.demo.common.Enum;

import lombok.Getter;

/**
 * EnumResultCode
 * 状态码范围：126000到130000
 * 返回前端的状态码和信息
 *
 * @author xcl
 * @date 2018/8/8 13:49
 */
@Getter
public enum ResultEnum {
    SUCCESS(126000, "成功"),
    FAIL(126007, "失敗");

    public Integer code;
    public String name;

    ResultEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据状态码获取状态码描述
     *
     * @param code 状态码
     * @return String 状态码描述
     */
    public static String getMessage(Integer code) {
        String result = null;
        for (ResultEnum r : ResultEnum.values()) {
            if (r.code.equals(code)) {
                result = r.name;
            }
        }
        return result;
    }
}
