package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 * — 定义实现类的接口，该接口不一定要与Abstraction的接口完全一致；事实上这两个 接口可以完全不同。
 * 一般来讲，Implementor接口仅提供基本操作，而Abstraction则定义了基于这些基本操作的较高层次的操作。
 */
public interface Implementor {

    public void operation();
}
