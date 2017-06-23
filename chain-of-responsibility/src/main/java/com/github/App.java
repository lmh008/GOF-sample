package com.github;

/**
 * 责任链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这 些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * 3.适用性在以下条件下使用Responsibility链：
 * •有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 * •你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 * •可处理一个请求的对象集合应被动态指定。
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
