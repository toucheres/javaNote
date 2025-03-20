package homework;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class GameFrame extends JFrame {
    GameFrame() {
        this.setBackground(Color.BLACK);
        setSize(1000, 1000);// 设置窗体的宽和高
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread thread = new Thread(this.new updata()); // 使用 self 实例创建内部类
        thread.start();
        this.setVisible(true);
    }

    private class updata implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
                hight += 2;

                repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    int hight = 0;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.clearRect(0, 0, 1000, 1000);
        g.drawRect(10 + 100 - 15, hight + 150 + 150, 30, 150);
        g.drawRect(10 + 0, hight + 200, 50, 200);
        g.drawRect(10 + 150, hight + 200, 50, 200);
        g.drawRect(10 + 50, hight + 250, 100, 100);
        g.drawRoundRect(10 + 50, hight + 250, 100, 100, 100, 100);

        g.drawRect(20 + 200 + 100 - 15, hight + 150 + 150, 30, 150);
        g.drawRect(20 + 200 + 0, hight + 200, 50, 200);
        g.drawRect(20 + 200 + 150, hight + 200, 50, 200);
        g.drawRect(20 + 200 + 50, hight + 250, 100, 100);
        g.drawRoundRect(20 + 200 + 50, hight + 250, 100, 100, 100, 100);

        g.drawRect(30 + 400 + 100 - 15, hight + 150 + 150, 30, 150);
        g.drawRect(30 + 400 + 0, hight + 200, 50, 200);
        g.drawRect(30 + 400 + 150, hight + 200, 50, 200);
        g.drawRect(30 + 400 + 50, hight + 250, 100, 100);
        g.drawRoundRect(30 + 400 + 50, hight + 250, 100, 100, 100, 100);

        g.drawRect(40 + 600 + 100 - 15, hight + 150 + 150, 30, 150);
        g.drawRect(40 + 600 + 0, hight + 200, 50, 200);
        g.drawRect(40 + 600 + 150, hight + 200, 50, 200);
        g.drawRect(40 + 600 + 50, hight + 250, 100, 100);
        g.drawRoundRect(40 + 600 + 50, hight + 250, 100, 100, 100, 100);
    }
}
