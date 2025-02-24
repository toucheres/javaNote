import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        setTitle("My Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center window on screen
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });
    }
}