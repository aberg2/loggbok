import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

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
    private Date createdAt;
    private Date updatedAt;

    public fenst() {
        createdAt = new Date();
        model myObj = new model();

        frame = new JFrame("To");
        frame.setPreferredSize(new Dimension( 800,800));
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        textArea1.setText(myObj.message); // Inlägg
        textArea1.setLineWrap(false);
        textArea2.setText(String.valueOf(createdAt)); // Datum
        textArea2.setLineWrap(false);

        String talnamn = "loggbok.txt";
        try {


            PrintWriter talSkriv = new PrintWriter( new FileWriter(talnamn));

                talSkriv.println();
                System.out.println(talSkriv);

            talSkriv.flush();
            talSkriv.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
