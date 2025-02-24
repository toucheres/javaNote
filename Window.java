import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        setTitle("My Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setResizable(false);
        setLocationRelativeTo(null); // Center window on screen
        setLayout(null);
        JButton btns[] = new JButton[10];
        for(int i = 1;i<10;i++)
        {
            btns[i] = new JButton();
            btns[i].setText("" + i);
            btns[i].setSize(50, 50);
            btns[i].setLocation(100 + 50 * ((i-1) % 3), 100 + 50 * ((i-1) / 3));
            add(btns[i]);
        }
        JButton btn10 = new JButton();
        btn10.setText("" +10);
        btn10.setSize(150, 50);
        btn10.setLocation(100, 100 + 50 * 3);
        add(btn10);
        JButton btnx = new JButton();
        btnx.setText("*");
        btnx.setSize(50, 50);
        btnx.setLocation(100+50*3, 100);
        add(btnx);
        
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });
        System.out.println(Arrays.toString(args));
    }
}