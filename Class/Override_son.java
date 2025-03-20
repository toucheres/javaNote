package Class;

public class Override_son extends Override_parent {
    @Override
    public void fun()
    {
        System.out.println("子类方法");
    }

    static public void main(String[] in)
    {
        Override_parent p = new Override_parent();
        p.fun();
        Override_parent pp = new Override_son();
        pp.fun();
    }
}
