import java.util.LinkedList;
import java.util.List;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 * 负责人
 * — 负责保存好备忘录。
 * — 不能对备忘录的内容进行操作或检查。
 */
public class Caretaker {

    private LinkedList<Memento> mementos;

    public Caretaker() {
        mementos = new LinkedList<>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento() {
        if (mementos.size() == 1) {
            return mementos.get(0);
        } else {
            return mementos.removeLast();
        }
    }
}
