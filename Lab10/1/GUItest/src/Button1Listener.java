import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Listener implements ActionListener {

    private int count;
    JLabel lable;

    public Button1Listener(JLabel lable) {
        count = 0;
        this.lable = lable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        this.lable.setText(count + "");
    }
}
