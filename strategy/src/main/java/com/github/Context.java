package com.github;

import java.security.NoSuchAlgorithmException;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 *
 * Context(上下文，如Composition)
 * — 用一个ConcreteStrategy对象来配置。
 * — 维护一个对Strategy对象的引用。
 * — 可定义一个接口来让Stategy访问它的数据。
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
