package Class;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.event.MouseInputAdapter;
import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;

public class Paint extends JFrame {
    public static void main(String[] in) {
        Paint self = new Paint();
        self.setVisible(true);
        Thread thread = new Thread(self.new updata()); // 使用 self 实例创建内部类
        thread.start(); // 注意：应该用 start() 而非 run()
    }

    int x;
    int y;

    private class updata implements Runnable
    {
        public void run()
        {
            for(int i=0;i<10;i++)
            {
                hight -= 10;
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
    Paint() {
        super("动态绘图示例");
        setSize(1000, 1000);// 设置窗体的宽和高
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MouseInputAdapter() { // 移除不必要的强制类型转换
            public void mousePressed(MouseEvent obj) {
                x = obj.getX(); // 使用正确的方法获取x坐标
                y = obj.getY(); // 使用正确的方法获取y坐标
            }
            // 移除这里的分号
        });
    }

    int hight = 0;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        // g.drawLine(0, 0, 100, 100);
        // for(int w=0;w<100;w++)
        // {
        // g.drawRect(0,0,10*w,10*w);
        // }
        g.drawRect(100 - 15, 150, 30, 150 + hight);
        g.drawRect(0, 200, 50, 200 + hight);
        g.drawRect(150, 200, 50, 200 + hight);
        g.drawRect(50, 250, 100, 100 + hight);
        g.drawRoundRect(50, 250, 100, 100 + hight, 100, 100);
    }
}
