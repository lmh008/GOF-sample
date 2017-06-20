package com.github;

/**
 * 状态模式
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 * <p>
 * 在下面的两种情况下均可使用状态模式
 * • 一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为。
 * • 一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。
 * 要点：
 *
 * 1）谁定义状态转换
 * State模式不指定哪一个参与者定义状态转换准则。如果该准则是固定的,那么它们可在Context中完全实现。
 * 然而若让 State子类自身指定它们的后继状态以及何 时进行转换,通常更灵活更合适。
 * 这需要Context增加一个接口,让State对象显式地设定Context的当前状态。
 * 用这种方法分散转换逻辑可以很容易地定义新的 State子类来修改和扩展该逻辑。
 * 这样做的一个缺点是，一个State子类至少拥有一个其他子类的信息,这就再各子类之间产生了实现 依赖。
 * 
 *  2) 创建和销毁State对象
 *  一个常见的值得考虑的实现上的权衡是
 *  究竟是 ( 1 ) 仅当需要State对象时才创建它们并随后销毁它们，还是 ( 2 ) 提前创建它们并且始终不销毁它们（TCPConnectV2）。
 *  当将要进入的状态在运行时是不可知的,并且上下文不经常改变状态时,第一种选择较为可取。这种方法避免创建不会被用到的对象,如果State对象存储大量的信息时这一点很重要。
 *  当状态改变很频繁时,第二种方法较好。在这种情况下最好避免销毁状态,因为可能很快再次需要用到它们。
 *  此时可以预先一次付清创建各个状态对象的开销,并且在运行过程中根本不存在销毁状态对象的开销。但是这种方法可能不太方便,因为Context必须保存对所有可能会进入的那些状态的引用
 */
public class App {

    public static void main(String[] args) {
        TCPConnect tcpConnect = new TCPConnect();
        tcpConnect.connect();
        tcpConnect.sendData("data");
        tcpConnect.close();
    }
}