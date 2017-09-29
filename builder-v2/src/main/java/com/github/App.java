package com.github;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws SQLException {
        People zhangsan = People.getBuilder("1", "zhangsan").build();
        zhangsan.sayHello();

        People lisi = People.getBuilder("1", "lisi").age(18).gender("man").build();
        lisi.sayHello();
    }
}
