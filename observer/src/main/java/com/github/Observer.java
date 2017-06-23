package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * Observer（观察者）
 * —为那些在目标发生改变时需获得通知的对象定义一个更新接口。
 */
public interface Observer {

    void update(int state);

}
