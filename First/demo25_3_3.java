package First;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class demo25_3_3 {
    public static void main_1(String[] in)
    {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);
        JButton btn_ok = new JButton();
        btn_ok.setSize(100, 100);
        btn_ok.setLocation(100, 100);
        JButton btn_cancel = new JButton();
        btn_cancel.setSize(100, 100);
        btn_cancel.setLocation(200, 100);
        wind.add(btn_cancel);
        wind.add(btn_ok);
    }

    public static void main_2(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);

        JButton btn_ok = new JButton();
        btn_ok.setSize(100, 100);
        btn_ok.setLocation(100, 100);
        JButton btn_cancel = new JButton();
        btn_cancel.setSize(100, 100);
        btn_cancel.setLocation(200, 100);

        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);
        panel.setSize(800, 800);
        panel.add(btn_cancel);
        panel.add(btn_ok);
        panel.setLocation(0, 0);
        panel.setVisible(true);
        for (int i = 0; i < 10; i++) {
            JButton tpButton = new JButton();
            tpButton.setSize(100, 100);
            panel.add(tpButton);
        }
        wind.add(panel);
    }
    
    public static void main(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);

        JButton btn_ok = new JButton();
        btn_ok.setSize(100, 100);
        btn_ok.setLocation(100, 100);
        JButton btn_cancel = new JButton();
        btn_cancel.setSize(100, 100);
        btn_cancel.setLocation(200, 100);

        JPanel panel = new JPanel();
        BorderLayout layout = new BorderLayout();
        panel.setLayout(layout);
        panel.setSize(500, 500);
        // panel.add(btn_cancel);
        // panel.add(btn_ok);
        panel.setLocation(0, 0);
        panel.setVisible(true);
        JButton nor = new JButton();
        JButton sou = new JButton();
        JButton east = new JButton();
        JButton west = new JButton();
        panel.add(nor, BorderLayout.NORTH);
        panel.add(sou, BorderLayout.SOUTH);
        panel.add(east, BorderLayout.EAST);
        panel.add(west, BorderLayout.WEST);
        // for (int i = 0; i < 10; i++) {
        //     JButton tpButton = new JButton();
        //     tpButton.setSize(100, 100);
        //     panel.add(tpButton);
        // }
        wind.add(panel);
    }
}
