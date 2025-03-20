package Class;

public class Init {
    int sss;
    {
        System.out.println("1");
        sss = 1;
    }
    {
        System.out.println("2");
    }

    static
    {
        System.out.println("s1");
    }
    static {
        System.out.println("s2");
    }

    Init()
    {
        System.err.println("gouzao");
    }

    static public void main(String[] in)
    {
        for(String a:in)
        {
            System.out.println(a);
        }
    }
}
