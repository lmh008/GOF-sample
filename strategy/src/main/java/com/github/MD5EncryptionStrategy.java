package com.github;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 *
 * ConcreteStrategy(具体策略，如SimpleCompositor,TeXCompositor,ArrayCompositor)
 * —以Strategy接口实现某具体算法。
 */
public class MD5EncryptionStrategy extends EncryptionStrategy{

    public byte[] endCode(byte[] bytes) throws NoSuchAlgorithmException {
        MessageDigest sha = MessageDigest.getInstance("MD5");
        sha.update(bytes);
        return sha.digest();
    }
}
