/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 */
public class Originator {

    private String state;

    public Originator() {
        this.state = "init";
    }

    public Memento backUp() {
        return new Memento(this.state);
    }

    public void recover(Memento memento) {
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println(this.state);
    }
}
