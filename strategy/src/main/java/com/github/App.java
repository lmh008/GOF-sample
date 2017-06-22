package com.github;

import java.security.NoSuchAlgorithmException;

/**
 * 策略模式
 * 定义一系列的算法 , 把它们一个个封装起来 ,  并且使它们可相互替换。本模式使得算法可独 立于使用它的客户而变化。
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchAlgorithmException {
        String source = "123sadw";
        EncryptionStrategy encryptionStrategy = new MD5EncryptionStrategy();
//        EncryptionStrategy encryptionStrategy = new SHAEncryptionStrategy();
        Context context = new Context();
        context.setEncryptionStrategy(encryptionStrategy);
        System.out.println(context.getResult(source));
    }
}
