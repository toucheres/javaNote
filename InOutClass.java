import java.util.Scanner;
public class InOutClass
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inint = in.nextInt();
        System.out.println("输入了" + inint);
        in.close();
    }
}