/**
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 * 有时有必要记录一个对象的内部状态。为了允许用户取消不确定的操作或从错误中恢复过来，
 * 需要实现检查点和取消机制而要实现这些机制，你必须事先将状态信息保存在某处，这样才能将对象恢复到它们先前的状态。
 */
public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.backUp());

        originator.setState("1");
        caretaker.addMemento(originator.backUp());

        originator.setState("2");
        caretaker.addMemento(originator.backUp());

        originator.setState("3");
        caretaker.addMemento(originator.backUp());

        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
        originator.recover(caretaker.getMemento());
        originator.show();
    }
}
