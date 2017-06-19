package com.github;

import java.security.NoSuchAlgorithmException;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class Context {

    private EncryptionStrategy encryptionStrategy;

    public String getResult(String target) throws NoSuchAlgorithmException {
        return this.encryptionStrategy.encrypt(target);
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }
}
