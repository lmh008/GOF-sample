package com.github;

import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
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
