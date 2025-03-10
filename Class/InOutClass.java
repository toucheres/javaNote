package Class;
import java.util.Scanner;

public class InOutClass
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inint_1 = in.nextInt();
        int inint_2 = in.nextInt();
        System.out.println("输出和为" + Caculate.add(inint_1, inint_2));
        in.close();
    }
    
    public static void main_1(String[] args) {
        Scanner in = new Scanner(System.in);
        Caculate caculate = new Caculate();
        caculate.tpa = in.nextInt();
        caculate.tpb = in.nextInt();
        System.out.println("输出差为" + caculate.mius());
        in.close();
    }

}