package com.github;

import java.security.NoSuchAlgorithmException;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public abstract class EncryptionStrategy {

    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String encrypt(String target) throws NoSuchAlgorithmException {
        byte[] bytes = this.endCode(target.getBytes());
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }

    public abstract byte[] endCode(byte[] bytes) throws NoSuchAlgorithmException;
}
