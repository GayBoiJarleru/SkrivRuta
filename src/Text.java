import javax.swing.*;

public class Text {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text");
        frame.setContentPane(new Text().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextArea textArea1;
    private JPanel Panel;
}
