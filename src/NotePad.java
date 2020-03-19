import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.
import java.io.FileFilter*;
import java.util.Scanner*;


public class Text {
    public Text() {

        sparaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fc = new JFileChooser();
                int resultat = fc.showOpenDialog(null);
                if (resultat != JFileChooser.APPROVE_OPTION) {
                    System.out.println("ingen fil valdes");
                    System.exit(0);
                }
            }
        }}; /* <- vad fan händer här */

}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text");
        frame.setContentPane(new Text().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton nyttButton;
    private JButton sparaButton;
    private JButton darkModeButton;
    private JTextArea textArea1;
    private JPanel Panel;
}
