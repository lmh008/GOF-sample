package com.github;

/**
 * 责任链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这 些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 */
public class App {

    public static void main(String[] args) {
        Request request = new Request("asd<script>，敏感，asdads");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc.addFilter(fc2);
        fc.doFilter(request, fc);
        System.out.println(request.getRqtStr());
    }
}
