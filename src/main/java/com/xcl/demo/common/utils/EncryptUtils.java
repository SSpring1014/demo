package com.xcl.demo.common.utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * EncryptUtils
 *
 * @author xcl
 * @date 2018/8/15 19:24
 */
public class EncryptUtils {
    /**
     * 密钥
     */
    private static final String KEY = "123456789a?";

    /**
     * 加密
     *
     * @param text 明文
     * @return 密文
     */
    public static String encrypt(String text) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(KEY);
        return encryptor.encrypt(text);
    }

    /**
     * 解密
     *
     * @param ciphertext 密文
     * @return 明文
     */
    public static String decrypt(String ciphertext) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(KEY);
        return encryptor.decrypt(ciphertext);
    }

}
