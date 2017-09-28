/**
 * 实现一个克隆自身的操作
 */
public class ConcretePrototype implements Prototype {

    private String f1;

    private int f2;

    public ConcretePrototype(String f1, int f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }

    @Override
    public Prototype clone1() {
        return new ConcretePrototype(this.f1, this.f2);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "f1='" + f1 + '\'' +
                ", f2=" + f2 +
                '}';
    }
}
