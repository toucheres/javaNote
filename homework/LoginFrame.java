package homework;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{

    public LoginFrame(String in)
    {
        this.setSize(320,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle(in);
        
        JTextField name = new JTextField();
        name.setSize(150, 20);
        name.setLocation(100, 100);
        
        JTextField password = new JTextField();
        password.setSize(150, 20);
        password.setLocation(100, 150);

        JLabel name_show = new JLabel();
        name_show.setText("登录名");
        name_show.setSize(50, 20);
        name_show.setLocation(50, 100);

        JLabel password_show = new JLabel();
        password_show.setText("密码");
        password_show.setSize(50, 20);
        password_show.setLocation(50, 150);

        JButton ok = new JButton();
        ok.setText("确定");
        // 宽度不够时只显示 "..."
        ok.setSize(100, 20);
        ok.setLocation(50, 200);
        
        JButton cancle = new JButton();
        cancle.setText("取消");
        cancle.setSize(100, 20);
        cancle.setLocation(150, 200);


        ok.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // JOptionPane.showMessageDialog(null, "Button clicked!");
                if(name.getText().equals("admin")  && password.getText().equals("123")) 
                {
                    JOptionPane.showMessageDialog(LoginFrame.this, "登录成功!","", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(LoginFrame.this, "登录名或密码错误!","" ,JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cancle.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // JOptionPane.showMessageDialog(null, "Button clicked!");
                LoginFrame.this.setVisible(false);
                System.exit(0);
            }
        });

        this.add(ok);
        this.add(cancle);
        this.add(name_show);
        this.add(password_show);
        this.add(name);
        this.add(password);
        // 在Swing中，应该先初始化和添加所有组件，然后才设置窗口可见。
        this.setVisible(true);
    }
}