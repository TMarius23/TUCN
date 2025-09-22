import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Listener extends Component implements ActionListener {

    JTextField tf1;
    JTextField tf2;
    JTextField tf_rezultat;

    Button1Listener(JTextField tf1, JTextField tf2, JTextField tf_rezultat) {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.tf_rezultat = tf_rezultat;
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }


    public void actionPerformed(ActionEvent e) {
        if (tf1.getText().length() > 0 && tf2.getText().length() > 0) {
            Triangle t1;
            try {
                t1 = new Triangle(Float.parseFloat(tf1.getText()), Float.parseFloat(tf2.getText()), 0, Color.BLACK);
                tf_rezultat.setText(String.valueOf(t1.ariaForma()));

                tf1.setText(" ");
                tf2.setText(" ");

            } catch (Exception ex) {
                showError("Nu ati introdus date valide!");
            }

        } else {
            showError("Nu ati introdus date valide!");
        }


    }
}
