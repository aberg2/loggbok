import javax.swing.*;
import java.awt.*;

/**
 * Skapat februari 2022-02-24 - 13:01
 * fenst
 * Skriven av coolingen
 */
public class fenst {
    private JFrame frame;
    private JPanel panel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;

    public fenst() {
        frame = new JFrame("To");
        frame.setPreferredSize(new Dimension( 800,800));
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        model myObj = new model();
        String text = myObj.message;
        textArea1.setText(text);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);


    }

}
