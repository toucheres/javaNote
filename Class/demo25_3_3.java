package Class;

import java.awt.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

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
    
    // borderlayout
    public static void main_3(String[] in) {
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
        panel.setBorder(new TitledBorder("test"));
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
        JButton cent = new JButton();
        panel.add(nor, BorderLayout.NORTH);
        panel.add(sou, BorderLayout.SOUTH);
        panel.add(east, BorderLayout.EAST);
        panel.add(west, BorderLayout.WEST);
        panel.add(cent, BorderLayout.CENTER);

        wind.add(panel);
    }
    
    public static void main_4(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
        GridLayout layout = new GridLayout(2, 2);
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
        JButton cent = new JButton();
        panel.add(nor, BorderLayout.NORTH);
        panel.add(sou, BorderLayout.SOUTH);
        panel.add(east, BorderLayout.EAST);
        panel.add(west, BorderLayout.WEST);
        panel.add(cent, BorderLayout.CENTER);

        wind.add(panel);
    }

    // 控件    
    public static void main_5(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
        GridLayout layout = new GridLayout(2, 2);
        panel.setLayout(layout);
        panel.setSize(1000, 1000);
        panel.setLocation(0, 0);
        panel.setVisible(true);

        JToggleButton btn_ToggleButton = new JToggleButton();
        panel.add(btn_ToggleButton);
        JCheckBox btnCheckBox = new JCheckBox();
        btnCheckBox.setSelected(true);
        panel.add(btnCheckBox);

        BasicArrowButton btn_up = new BasicArrowButton(BasicArrowButton.NORTH);
        BasicArrowButton btn_down = new BasicArrowButton(BasicArrowButton.SOUTH);
        BasicArrowButton btn_right = new BasicArrowButton(BasicArrowButton.EAST);
        BasicArrowButton btn_left = new BasicArrowButton(BasicArrowButton.WEST);
        panel.add(btn_left);
        panel.add(btn_right);
        panel.add(btn_down);
        panel.add(btn_up);

        JPanel checkBoxJPanel = new JPanel();
        JRadioButton check1 = new JRadioButton("check1");
        JRadioButton check2 = new JRadioButton("check2");
        ButtonGroup checkButtonGroup = new ButtonGroup();
        checkButtonGroup.add(check1);
        checkButtonGroup.add(check2);
        checkBoxJPanel.add(check1);
        checkBoxJPanel.add(check2);

        panel.add(checkBoxJPanel);

        wind.add(panel);

    }
    
    public static void main_6(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setSize(800, 800);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
        wind.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
        GridLayout layout = new GridLayout(9, 1);
        panel.setLayout(layout);
        panel.setSize(800, 800);
        panel.setLocation(0, 0);
        panel.setVisible(true);

        JPanel userJPanel = new JPanel();
        userJPanel.setLocation(00, 200);
        userJPanel.setSize(200, 50);
        userJPanel.setLayout(null);
        JLabel nameoutLabel = new JLabel("用户名");
        JTextField nameinArea = new JTextField();
        nameoutLabel.setSize(50, 50);
        nameoutLabel.setLocation(0, 0);
        nameinArea.setSize(100, 50);
        nameinArea.setLocation(100, 0);
        userJPanel.add(nameoutLabel);
        userJPanel.add(nameinArea);
        panel.add(userJPanel);

        JPanel passwordJPanel = new JPanel();
        passwordJPanel.setLocation(0, 70);
        passwordJPanel.setSize(200, 100);
        passwordJPanel.setLayout(null);
        JLabel passwordoutLabel = new JLabel("密码");
        JTextField passwordinArea = new JTextField();
        passwordoutLabel.setSize(50, 50);
        passwordoutLabel.setLocation(0, 0);
        passwordinArea.setSize(100, 50);
        passwordinArea.setLocation(100, 0);
        passwordJPanel.add(passwordoutLabel);
        passwordJPanel.add(passwordinArea);

        panel.add(passwordJPanel);

        JToggleButton btn_ToggleButton = new JToggleButton("1");
        JToggleButton btn_ToggleButton_2 = new JToggleButton("2");
        JToggleButton btn_ToggleButton_3 = new JToggleButton("3");
        JToggleButton btn_ToggleButton_4 = new JToggleButton("4");
        btn_ToggleButton.setSize(30, 10);
        btn_ToggleButton_2.setSize(30, 10);
        btn_ToggleButton_3.setSize(30, 10);
        btn_ToggleButton_4.setSize(30, 10);
        btn_ToggleButton.setLocation(0, 0);
        btn_ToggleButton_2.setLocation(0, 10);
        btn_ToggleButton_3.setLocation(0, 20);
        btn_ToggleButton_4.setLocation(0, 30);
        panel.add(btn_ToggleButton);
        panel.add(btn_ToggleButton_2);
        panel.add(btn_ToggleButton_3);
        panel.add(btn_ToggleButton_4);
        JCheckBox btnCheckBox = new JCheckBox();
        btnCheckBox.setSelected(true);
        //panel.add(btnCheckBox);

        // BasicArrowButton btn_up = new BasicArrowButton(BasicArrowButton.NORTH);
        // BasicArrowButton btn_down = new BasicArrowButton(BasicArrowButton.SOUTH);
        // BasicArrowButton btn_right = new BasicArrowButton(BasicArrowButton.EAST);
        // BasicArrowButton btn_left = new BasicArrowButton(BasicArrowButton.WEST);
        // panel.add(btn_left);
        // panel.add(btn_right);
        // panel.add(btn_down);
        // panel.add(btn_up);

        JPanel checkBoxJPanel = new JPanel();
        checkBoxJPanel.setVisible(true);
        JRadioButton check1 = new JRadioButton("男");
        JRadioButton check2 = new JRadioButton("女");
        ButtonGroup checkButtonGroup = new ButtonGroup();
        checkButtonGroup.add(check1);
        checkButtonGroup.add(check2);
        checkBoxJPanel.add(check1);
        checkBoxJPanel.add(check2);
        checkBoxJPanel.setLocation(200, 100);
        checkBoxJPanel.setSize(50, 50);
        panel.add(checkBoxJPanel);

        wind.add(panel);

    }
    
    public static void main(String[] in) {
        JFrame wind = new JFrame("myWindow");
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setSize(400, 200);

        // 使用BorderLayout作为主面板管理器
        JPanel mainPanel = new JPanel(new BorderLayout());
        wind.setContentPane(mainPanel);

        // 使用GridBagLayout布局登录区域
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // 用户名行
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(new JLabel("用户名:"), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(15);
        loginPanel.add(nameField, gbc);

        // 密码行
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(new JLabel("密码:"), gbc);

        gbc.gridx = 1;
        JTextField passwordField = new JTextField(15);
        loginPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JComboBox<String> listComboBox = new JComboBox<String>();
        for (int i = 0; i < listComboBox.getItemCount(); i++) {
            listComboBox.addItem("test_" + i);
        }
        loginPanel.add(listComboBox);

        mainPanel.add(loginPanel, BorderLayout.CENTER);

        wind.setVisible(true);

    }

}
